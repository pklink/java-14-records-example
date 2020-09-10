package net.einself.records;

public record Dog(String breed, String name) {

    public Dog(String name) {
        this("Poodle", name);
    }

    public boolean isPoodle() {
        return breed.equals("Poodle");
    }

    public Dog {
        if (breed == null) {
            throw new IllegalArgumentException();
        }
        if (name.equals("Peanutbutter")) {
            name = "Mr. Peanutbutter";
        }
    }

}
