class Solution {
    public String convertDateToBinary(String date) 
    {
        String[] parts=date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        String yearBinary = Integer.toString(year, 2);
        String monthBinary = Integer.toString(month, 2);
        String dayBinary = Integer.toString(day, 2);
        String binaryDate = yearBinary + "-" + monthBinary + "-" + dayBinary;
        return binaryDate;
    }
}