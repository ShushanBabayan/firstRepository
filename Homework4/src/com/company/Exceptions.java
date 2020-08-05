package com.company;

class QueueIsEmptyException extends Exception {
    QueueIsEmptyException() {
    }

    QueueIsEmptyException(String message) {
        super(message);
    }
}

class QueueIsFullException extends Exception {
    QueueIsFullException() {
    }

    QueueIsFullException(String message) {
        super(message);
    }
}