public class AppoinmentBook {
    private boolean [][] schedule;

    public AppointmentBook(boolean[][] schedule)
    {
        this.schedule = schedule; 
    }
    private void reserveBlock(int period, int startMinute, int duration) {
    }
    private boolean isMinuteFree(int period, int minute) {
        return schedule[period - 1][minute];
    }
    public int findFreeBlock(int period, int duration) {
        return 0;
    }
    public boolean makeAppointment(int startPeriod, int endPeriod, int duration) {
        return false;
    }
}