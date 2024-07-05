package week1;

public class A005_20240705 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for(int i=0; i<skill_trees.length; i++){
            String tree = skill_trees[i].replaceAll("[^" + skill + "]","");
            for(int j=0; j<skill.length() + 1; j++){
                String sub = skill.substring(0,j);
                if(tree.equals(sub)){
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}