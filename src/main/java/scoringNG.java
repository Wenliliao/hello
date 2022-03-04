public class scoringNG {
    public static void main(String[] args) {
        String[] names = {"toy","sam","wev","teb","rew"};
        int[] math = {70,89,56,34,47};
        int[] history = {60,56,76,84,45};
        for (int i = 0; i<5; i++){
            System.out.println(names[i] + "\t" + math[i] + "\t" + history[i] + "\t" + (math[i]+ history[i])/2);
        }

    }
}

