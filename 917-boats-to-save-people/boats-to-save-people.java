class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int c=0;
        int i=0;
        int j=people.length-1;
     Arrays.sort(people);
    while(i <= j){
    int sum = people[i]+people[j];
      if(sum <= limit)
        i++;
        c++;
        j--;
    }
    return c;
    }
}