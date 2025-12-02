package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test

        boolean pendingCarriageReturn = false;
        int currentByte;
        while ((currentByte = System.in.read()) != -1) {
            if (pendingCarriageReturn) {
                if (currentByte == '\n') {
                    System.out.write('\n');
                    pendingCarriageReturn = false;
                    continue;
                } else {
                    System.out.write('\r');
                    pendingCarriageReturn = false;
                    // продолжаем обрабатывать текущий байт как новый символ
                }
            }

            if (currentByte == '\r') {
                pendingCarriageReturn = true;
            } else {
                System.out.write(currentByte);
            }
        }

        if (pendingCarriageReturn) {
            System.out.write('\r');
        }

        System.out.flush();
    }
}
