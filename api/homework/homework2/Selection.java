package api.homework.homework2;

public class Selection {

    public static StringBuilder formResponsSqlWrite(String sqlSelect, String jsonFilter){
        StringBuilder response = new StringBuilder();
        String[] filter = jsonFilter.split(", ");
        String[] select = sqlSelect.split(", ");
        int i = 0;
        int j = 0;
        int index = 0;
        String str = "";
        
        while (i < select.length){

            if (j == 4) { j = 0; index = 0; str = "";}

            if (j == 3){
                String[] age = select[i].split(":");
                if (age[1].equals("\"null\"")){
                }
                else if (index == j) {
                    str += select[i] + " ";
                    response.append(str);
                }
            }
            else if (filter[j].equals(select[i])) {
                index++;
                str += select[i] + ", ";
            }

            i++; j++;


        }
        return response;

    }
    
}
