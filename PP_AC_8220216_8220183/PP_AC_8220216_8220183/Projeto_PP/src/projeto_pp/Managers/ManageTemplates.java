/* 
* Nome: Joaquim Fontes Matos
* Número: 8220216
* Turma: LEI12T3
* 
* Nome: Leonardo Henrique Barbosa Da Silva
* Número: 8220183
* Turma: LEI12T3
 */
package projeto_pp.Managers;

import projeto_pp.files.ConsoleReader;

/**
 * The ManageTasks class provides a method for getting the project_template
 * information.
 */
public class ManageTemplates {

    //strings containg the project templates created by us
    private static final String TEMPLATE1 = "templates/project_template.json";
    private static final String TEMPLATE2 = "templates/project_template_2.json";
    private static final String TEMPLATE3 = "templates/project_template_3.json";
    private static final String TEMPLATE4 = "templates/project_template_4.json";
    private static final String TEMPLATE5 = "templates/project_template_5.json";

    /**
     * Retrives the project template chosen by the user.
     *
     * @return The project template chosen by the user.
     */
    public static String chooseTemplate() {
        StringBuilder sb = new StringBuilder();
        int option = 0;
        sb.append("Templates{\n");
        sb.append("\t1. project_template.json\n");
        sb.append("\t2. project_template_2.json\n");
        sb.append("\t3. project_template_3.json\n");
        sb.append("\t4. project_template_4.json\n");
        sb.append("\t5. project_template_5.json\n");
        sb.append("}");
        System.out.println(sb);
        do {
            option = ConsoleReader.intReader("Chose the number of the template you want for your project (1-2): ");
        } while (option < 1 || option > 5);
        switch (option) {
            case 1:
                return TEMPLATE1;
            case 2:
                return TEMPLATE2;
            case 3:
                return TEMPLATE3;
            case 4:
                return TEMPLATE4;
            case 5:
                return TEMPLATE5;
        }
        return null;
    }
}
