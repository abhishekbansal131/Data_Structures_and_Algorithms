package Array;

/* GLA University there is various department. It is asked to every dept to conduct meeting for all the employees of GLA University. The central
Management asked the dept kindly share starting time and ending time of the meeting in 24 hours format so that after verifying it will be
circulated among the GLA employees. But there is a problem that before circulating the meeting information, the central management will find out
if there are any clashes between time or not. If there are clashes it means the employee cannot attend all the meetings. Can you help central
management to find it out
 */

import java.util.Scanner;

public class TimeInterval {
    int start;
    int end;

    public TimeInterval(int start, int end) {
        this.start = start;
        this.end = end;
    }
    TimeInterval(){}

    public boolean canAttendMeeting(TimeInterval[] tlarr) {
        for(int i=0; i<tlarr.length; i++){
            for(int j=tlarr[i].start; j<tlarr[i].end; j++){
                for(int k=0; k<tlarr.length; k++){
                    if(i!=k) {
                        if (tlarr[k].start == j) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of meetings in the array so that we can set time interval according to that");
        int n = sc.nextInt();
        TimeInterval[] arr = new TimeInterval[n];
        System.out.println("Enter the starting and ending time of each meeting");
        for(int i=0; i<arr.length; i++){
            arr[i] = new TimeInterval(sc.nextInt(),sc.nextInt());
        }
        if(new TimeInterval().canAttendMeeting(arr)){
            System.out.println("Employee can attend all the meetings without any clash");
        }
        else {
            System.out.println("Employee can not attend all the meetings without any clash");
        }
    }
}
