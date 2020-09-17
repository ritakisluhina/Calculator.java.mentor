public  class Number {

    public static boolean isArabic(String[] parts) {
        if (parts == null) {
            return false;
        }
        try {
            int a = Integer.parseInt(parts[0]);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
