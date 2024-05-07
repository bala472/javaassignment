import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class FileDownloader extends Thread {
    private String fileUrl;
    private String destinationPath;
    private volatile boolean stopped;
    private int progress;

    public FileDownloader(String fileUrl, String destinationPath) {
        this.fileUrl = fileUrl;
        this.destinationPath = destinationPath;
        this.stopped = false;
        this.progress = 0;
    }

    public void stopDownload() {
        this.stopped = true;
    }

    public int getProgress() {
        return progress;
    }

    @Override
    public void run() {
        try {
            URL url = new URL(fileUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            long fileSize = connection.getContentLengthLong();

            try (InputStream inputStream = connection.getInputStream();
                 FileOutputStream outputStream = new FileOutputStream(destinationPath)) {

                byte[] buffer = new byte[1024];
                int bytesRead;
                long totalBytesRead = 0;

                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    if (stopped) {
                        System.out.println("Download interrupted.");
                        return;
                    }

                    outputStream.write(buffer, 0, bytesRead);
                    totalBytesRead += bytesRead;

                    if (fileSize > 0) {
                        int newProgress = (int) ((totalBytesRead * 100) / fileSize);
                        if (newProgress != progress) {
                            progress = newProgress;
                            System.out.println("Downloaded " + progress + "%");
                        }
                    }
                }

                System.out.println("Download completed.");
            }
        } catch (IOException e) {
            System.err.println("Error during download: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String fileUrl = "https://freetestdata.com/wp-content/uploads/2023/04/10.5-MB-scaled.bmp";
        String destinationPath = "downloaded_file.bmp";

        FileDownloader downloader = new FileDownloader(fileUrl, destinationPath);
        downloader.start();

        try {
            System.out.println("Press Enter to interrupt the download...");
            System.in.read();
            downloader.stopDownload();
            downloader.join();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
