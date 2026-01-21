class InvalidPasswordException extends Exception {
}

class Demo11{

    void validatePassword(String password) throws InvalidPasswordException {
        if (password.length() < 8) {
            throw new InvalidPasswordException();
        }
    }

    public static void main(String[] args) {

        String password = "abc123";  
	PasswordValidator p = new PasswordValidator();

        try {
            p.validatePassword(password);
        } catch (InvalidPasswordException e) {
            System.out.println("Invalid Password.");
        }
    }
}

