class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int i=0;
        int unsatisfied=0;
        int maxus=0;
        for(int j=0;j<minutes;j++){
            if(grumpy[j]==1){
                unsatisfied+=customers[j];
            }
        }
        maxus=Math.max(maxus,unsatisfied);
        for(int j=minutes;j<customers.length;j++){
            if(grumpy[j]==1){
                unsatisfied+=customers[j];
            }
            if(grumpy[i]==1){
                unsatisfied-=customers[i];   
            }
            i++;
            maxus=Math.max(maxus,unsatisfied);
        }
        int satisfied=0;
        for(int k=0;k<customers.length;k++){
            if(grumpy[k]==0){
                satisfied+=customers[k];
            }
        } 
        return satisfied+maxus;
    }
}