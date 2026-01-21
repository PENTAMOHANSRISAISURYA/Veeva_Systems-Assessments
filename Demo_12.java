class InvalidPasswordException extends Exception {
}

class Demo_12{
    void validatePassword(String password) throws InvalidPasswordException {
        if (password.length() < 8) {
            throw new InvalidPasswordException();
        }
    }
    public static void main(String[] args) {
        String password = "abc123";  
	    Demo11 d = new Demo11();
        try {
            d.validatePassword(password);
        } catch (InvalidPasswordException e) {
            System.out.println("Invalid Password.");
        }
    }
}



