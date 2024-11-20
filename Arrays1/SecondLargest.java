package Arrays1;
public class SecondLargest {

    static int findSecLarg(int[] ques){
        if(ques.length < 2){
            return -1;
        }

        int max = ques[0];
        int secMax = -1;

        for(int ele : ques){
            if(ele > max){
                secMax = max;
                max = ele;
            }
            else if(ele > secMax && ele != max){
                secMax = ele;
            }
        }
        return secMax;
    }

    public static void main(String[] args) {
        int[] ques = {1,1,2,2,3,3,4,4,5,5,5};
        System.out.println(findSecLarg(ques));
    }
}
