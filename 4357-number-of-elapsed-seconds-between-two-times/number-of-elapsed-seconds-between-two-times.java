class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        return seconds(endTime.split(":")) - seconds(startTime.split(":"));
    }

    public int seconds(String[] str) {
        int count = 0;
        count += Integer.parseInt(str[0]) * 60 * 60;
        count += Integer.parseInt(str[1]) * 60;
        count += Integer.parseInt(str[2]);
        return count;
    }
}