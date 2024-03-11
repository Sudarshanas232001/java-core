package com.learning.core.day1;
interface Medicinelnfo {
    void displayLabel();
}

class Tablet implements Medicinelnfo {
    @Override
    public void displayLabel() {
        System.out.println("Store Tablets in a cool dry place.");
    }
}

class Syrup implements Medicinelnfo {
    @Override
    public void displayLabel() {
        System.out.println("Syrup is consumable only on prescription.");
    }
}

class Ointment implements Medicinelnfo {
    @Override
    public void displayLabel() {
        System.out.println("Ointment is for external use only.");
    }
}

class DO1P02 {
    public static void main(String[] args) {
        Tablet tablet = new Tablet();
        Syrup syrup = new Syrup();
        Ointment ointment = new Ointment();

        tablet.displayLabel();
        syrup.displayLabel();
        ointment.displayLabel();
    }
}