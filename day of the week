class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        if(month<3){
            month+=12;
            year-=1;
        }
        int k=year%100;
        int j=year/100;
        int h=(day+(13*(month+1))/5+k+(k/4)+(j/4)+(5*j))%7;
        String[] days={"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","friday"};
        return days[h];
    }
}

OUTPUT:

Input
day =
31
month =
8
year =
2019
Output
"Saturday"
Expected
"Saturday"
