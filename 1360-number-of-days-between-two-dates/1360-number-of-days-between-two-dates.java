class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(countdays(date1)-countdays(date2));   
    }
    public int countdays(String date){
        int year=Integer.parseInt(date.substring(0,4));
        int month=Integer.parseInt(date.substring(5,7));
        int day=Integer.parseInt(date.substring(8,10));
        int total=0;
        for(int y=1971 ;y<year;y++){
            if(y%400==0 || (y%4==0 && y%100!=0)) total+=366;
            else total+=365;
        }
        int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
        for(int d=1;d<month;d++){
            total+=days[d-1];
        }
         if (month > 2 &&
        (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
        total++;
        }
        total+=day;
        return total;
    }
}