package Array;

/* GLA University there is various department. It is asked to every dept to conduct meeting for all the employees of GLA University. The central
Management asked the dept kindly share starting time and ending time of the meeting in 24 hours format so that after verifying it will be
circulated among the GLA employees. But there is a problem that before circulating the meeting information, the central management will find out
if there are any clashes between time or not. If there are clashes it means the employee cannot attend all the meetings. Can you help central
management to find it out
 */

import java.util.Arrays;
import java.util.Scanner;



public class TimeInterval {
    int start,end;

    public TimeInterval(int start,int end) {
        this.start=start;
        this.end=end;
    }

    public static boolean canAttendMeeting(TimeInterval[] arr){
        int[] start = new int[arr.length];
        int[] end = new int[arr.length];
        for(int i=0; i< arr.length; i++){
            start[i] = arr[i].start;
            end[i] = arr[i].end;
        }
        Arrays.sort(start);
        Arrays.sort(end);
        for(int i=0; i<start.length-1; i++){
            if(start[i+1]<end[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of dept.");
        int n = sc.nextInt();
        TimeInterval[] arr = new TimeInterval[n];
        System.out.println("Enter the starting and ending time of each dept. meeting");
        for(int i=0; i<arr.length; i++){
            arr[i] = new TimeInterval(sc.nextInt(),sc.nextInt());
        }
        if(TimeInterval.canAttendMeeting(arr)){
            System.out.println("Employee can attend all the meetings without any clash");
        }
        else {
            System.out.println("Employee can not attend all the meetings without any clash");
        }
    }
}
