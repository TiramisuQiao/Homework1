package Project3;

import java.util.Random;

public interface ChacaterInterface {
    /**
     * The user can use the buildNewcharacter() to set the basic information of the character
     * @param name A string that is the name of the character
     * @param height A float that is the height of the character
     * @param weight A float that is the weight of the character
     */
    public void buildNewcharacter(String name,float height,float weight);

    /**
     * The user could use the method to heal the character by percent
     * @param percentage A float that user input to heal their health
     */
    public void heal(float percentage);

    /**
     * The user could be injured by the method by percentage
     * @param percentage A float that user input to injure the character
     */
    public void injure(float percentage);

    /**
     * The user could use the method to change their morality
     * @param percentage A float that the user input to random a percentage to change their morality
     */
    public void change(float percentage);

    /**
     *
     * @return A string that contains the information of the character
     */
    public String tochString();
}

