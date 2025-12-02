package com.example.task04;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double sum = 0.0;

        while (scanner.hasNext()) {
            String token = scanner.next();
            try {
                sum += Double.parseDouble(token);
            } catch (NumberFormatException ignored) {
                // игнорируем токены, которые не похожи на число
            }
        }

        System.out.printf(Locale.US, "%.6f%n", sum);
        System.out.flush();
    }
}
