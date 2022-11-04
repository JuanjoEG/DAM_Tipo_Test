package English;

import _Main_.Principal;
import java.util.Scanner;
import static _Main_.Principal.tipo_test;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Test_English {
    
        public static void main(String[] args) {
        
                String menu="";
        do {
            Principal.setFallos(0);
            Principal.setAciertos(0);
            Principal.setContador(0);
            
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
        ************************************************************************
        *  ENGLISH TEST                                                        *
        ************************************************************************
        *                                                                      *
        *  1. TEMA: INTRODUCTIONS                                              *
        *  2. TEMA: AT PRESENT                                                 *
        *  3. TEMA: DATE AND TIME                                              *
        *  4. TEMA: ON THE PHONE                                               *
        *  5. TEMA:                                                            *
        *  6. TEMA:                                                            *
        *  7. TEMA:                                                            *
        *  8. TEMA:                                                            *
        *  9. TEMA:                                                            *
        * 10. TEMA:                                                            *
        * 11. TEMA:                                                            *
        * 12. TEMA:                                                            *
        * 13. TEMA:                                                            *
        * 14. TEMA:                                                            *
        * 15. TEMA:                                                            *
        *                                                                      *
        * 40. TEST DE REPASO I                                                 *
        * 50. TEST DE REPASO II                                                *
        *                                                                      *
        ************************************************************************
        *  0. ATR�S.                                                           *
        ************************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opci�n: ");
                menu = teclaStr.nextLine();
                switch (menu) {
                    case "1" -> {                        
                        System.out.println("\nTEMA " + menu + "\n");
        
            /*01*/      tipo_test("Which of the following greetings is formal?", "Good morning, Mr. Smith", "Hi, Fred", "Good morning, Alice.", "What's up?", "1");
            /*02*/      tipo_test("Which of the following introductions is informal?", "It's a pleasure to meet you.", "May I introduce you to Ms Granger?", "This is Harry.", "Pleased to meet you. ", "3");
            /*03*/      tipo_test("Which of the following statements is correct?", "First impressions do not matter much.", "First impressions are formed over time.", "First impressions are made in a matter of seconds.", "Body language is not important when making first impressions.", "3");
            /*04*/      tipo_test("Which of the following is not a farewell expression?", "You will always be welcome.", "Welcome, Mr Peters.", "We look forward to your next visit.", "Have a good day.", "2");
            /*05*/      tipo_test("Choose the right preposition to complete the sentence:\n        We'll see you ... Monday May 16th.", "On", "In", "At", "For", "1");
            /*06*/      tipo_test("Choose the right preposition to complete the sentence:\n        Are you open ... August or are you on holiday?", "On", "In", "At", "For", "2");
            /*07*/      tipo_test("Choose the right preposition to complete the sentence:\n        We don't close for summer holidays, we only close ... Christmas.", "At", "On", "In", "Until", "1");
            /*08*/      tipo_test("Choose the right preposition to complete the sentence:\n        I'm afraid Dr Peterson is away. She will be back ... two weeks.", "At", "On", "In", "Until", "3");
            /*09*/      tipo_test("Which of the following is not a good piece of advice to make a good impression?", "Make sure you greet the other person with a smile.", "Be polite and courteous.", "Don't smile; people will trust you more if you look serious and professional.", "Pay attention to your body language.", "3");
            /*10*/      tipo_test("Which of the following sentences is incorrect?", "We'll see you again next week.", "We'll see you again in a week.", "We'll see you again in next week.", "All the sentences are incorrect.", "3");                        
                    }
                    case "2" -> {
                        System.out.println("\nTEMA " + menu + "\n");
        
            /*01*/      tipo_test("Right after waking up you usually ...", "Go to bed", "Do homework", "Get up", "Go home", "3");
            /*02*/      tipo_test("Which part of speech is used to replace nouns?", "Pronouns", "Names", "Adverbs", "Prepositions ", "1");
            /*03*/      tipo_test("Which of the following sentences is correct?", "She often goes to the gym. She enjoys being fit.", "She never go to the gym. She enjoys being fit.", "She always goes to the gym. She enjoy being fit.", "She rarely go to the gym. She enjoy being fit.", "1");
            /*04*/      tipo_test("Choose the right option to complete the sentence:\n        Peter is always losing things. Now, he can't find ... laptop!", "Her", "Its", "Him", "His", "4");
            /*05*/      tipo_test("Which of the following sentences is incorrect?", "Doesn't she like working as a medical assistant?", "Does she like working as medical assistant?", "She does not like working as a medical assistant.", "She does like not working as a medical assistant.", "4");
            /*06*/      tipo_test("Which of the following is not a use of the present simple?", "Exclamations with \"here\" and \"there\".", "Expressing plans for the future.", "Newspapers headlines.", "Giving orders.", "4");
            /*07*/      tipo_test("Which of the following sentences is correct?", "What time does the nursery open?", "What time do the nursery open?", "What time the nursery does open?", "What time the nursery do open?", "1");
            /*08*/      tipo_test("Which of the following sentences is incorrect?", "I always go to the gym before breakfast.", "You hardly go to the dentist. That is not good.", "Usually, I have lunch at home.", "I often am worried about exam results.", "4");
            /*09*/      tipo_test("I go swimming on Monday and Wednesday every week. That means that ...", "I go swimming two times a week.", "I go swimming twice a week.", "None of the options is correct.", "Both options are correct.", "2");
            /*10*/      tipo_test("Which of the following adverbs is used to express that something happens\n        frequently?", "Rarely", "Often", "Sometimes", "Occasionally", "2");
                    }
                    case "3" -> {
                        System.out.println("\nTEMA " + menu + "\n");
                        
            /*01*/      tipo_test("Which of the following times is midnight?", "1:00", "0:00", "Both options are correct.", "None of the options is correct.", "2");
            /*02*/      tipo_test("Which of the following expressions is used to tell this time: 1:30 pm", "Half past one in the morning", "Half past one in the afternoon", "Thirty minutes to one in the afternoon", "Thirty minutes to one in the morning", "2");
            /*03*/      tipo_test("Which of the following expressions is used to tell this time: 9:40 am", "Twenty to ten in the morning", "Twenty to ten in the afternoon", "Twenty past ten in the morning", "Twenty past ten in the afternoon", "1");
            /*04*/      tipo_test("Which is the ordinal number for 3?", "Three", "Threeth", "Third", "Thirdth", "3");
            /*05*/      tipo_test("Which is the ordinal number for 80?", "Eightieth", "Eightyth", "None of the options is correct.", "Both options are correct.", "1");
            /*06*/      tipo_test("You work as a receptionist. Your name is Alice.\n        What do you say when taking a call at the company you work for?", "Hi, Alice. Great to hear from you!", "Thank you for calling. This is Alice. How can I help you?", "None of the options is correct.", "Both options are correct.", "2");
            /*07*/      tipo_test("Which of the following sentences is correct?", "What date it is?", "What date it today is?", "Today date?", "What's the date today?", "4");
            /*08*/      tipo_test("Which of the following sentences is not used to tell the date?", "It's May 13th.", "It's 13th of May.", "It's May thirteenth.", "May it's 13.", "4");
            /*09*/      tipo_test("Choose the right preposition to complete the sentence:\n        I'll see you ... Monday, August 12th.", "At", "On", "In", "Over", "2");
            /*10*/      tipo_test("Choose the right preposition to complete the sentence:\n        We are closed ... July for holidays.", "At", "On", "In", "Over", "3");                        
                    }
                    case "4" -> {
                        System.out.println("\nTEMA " + menu + "\n");                       
                        
            /*01*/      tipo_test("Which of the following is not a good tip when receiving a phone call?", "Smile.", "Ask the caller their name.", "Speak fast so that the call is shorter.", "Don't be afraid to ask the caller to repeat something.", "3");
            /*02*/      tipo_test("Choose the right option to complete the sentence:\n        Hold on a minute, please. I'll ... Mr Smith.", "Hang on you", "Put you through", "Put you through to", "Hang up", "3");
            /*03*/      tipo_test("Which of the following means to end the call?", "Hang on", "Hang up", "Hold on", "Hold up", "2");
            /*04*/      tipo_test("What is a missed call?", "It's a call you wanted to make but didn't have time to.", "It's a call you didn't get because you couldn't answer.", "Both options are correct.", "None of the options is correct.", "2");
            /*05*/      tipo_test("Which of the following expressions means to answer a call?", "Pick up", "Hang up", "Connect", "Put through", "1");
            /*06*/      tipo_test("The present continuous is not used for:", "Future plans.", "Regular actions or events.", "Actions in progress.", "Annoying habits.", "2");
            /*07*/      tipo_test("Which of the following sentences is incorrect?", "Are you applying for that job?", "Do you applying for that job?", "Will you apply for that job?", "Are you not applying for that job?", "2");
            /*08*/      tipo_test("Which of the following words is spelled wrong?", "Getting", "Runing ", "Making", "Playing", "2");
            /*09*/      tipo_test("Choose the right option to complete the sentence:\n        ... people are buying online these days.", "Increase", "Better", "More and more", "Growing", "3");
            /*10*/      tipo_test("Which of the following sentences is incorrect?", "Are they not going back home for Christmas?", "Aren't they going back home for Christmas?", "Are they going back home for Christmas?", "Are not they going back home for Christmas?", "4");                        
                    }
                    case "5" -> {
                        System.out.println("\nTEMA " + menu + "\n");
                        
            /*01*/      tipo_test("", "", "", "", "", "");
            /*02*/      tipo_test("", "", "", "", "", "");
            /*03*/      tipo_test("", "", "", "", "", "");
            /*04*/      tipo_test("", "", "", "", "", "");
            /*05*/      tipo_test("", "", "", "", "", "");
            /*06*/      tipo_test("", "", "", "", "", "");
            /*07*/      tipo_test("", "", "", "", "", "");
            /*08*/      tipo_test("", "", "", "", "", "");
            /*09*/      tipo_test("", "", "", "", "", "");
            /*10*/      tipo_test("", "", "", "", "", "");                        
                    }
                    case "6" -> {
                        System.out.println("\nTEMA " + menu + "\n");
                        
            /*01*/      tipo_test("", "", "", "", "", "");
            /*02*/      tipo_test("", "", "", "", "", "");
            /*03*/      tipo_test("", "", "", "", "", "");
            /*04*/      tipo_test("", "", "", "", "", "");
            /*05*/      tipo_test("", "", "", "", "", "");
            /*06*/      tipo_test("", "", "", "", "", "");
            /*07*/      tipo_test("", "", "", "", "", "");
            /*08*/      tipo_test("", "", "", "", "", "");
            /*09*/      tipo_test("", "", "", "", "", "");
            /*10*/      tipo_test("", "", "", "", "", "");                        
                    }
                    case "7" -> {
                        System.out.println("\nTEMA " + menu + "\n");
                        
            /*01*/      tipo_test("", "", "", "", "", "");
            /*02*/      tipo_test("", "", "", "", "", "");
            /*03*/      tipo_test("", "", "", "", "", "");
            /*04*/      tipo_test("", "", "", "", "", "");
            /*05*/      tipo_test("", "", "", "", "", "");
            /*06*/      tipo_test("", "", "", "", "", "");
            /*07*/      tipo_test("", "", "", "", "", "");
            /*08*/      tipo_test("", "", "", "", "", "");
            /*09*/      tipo_test("", "", "", "", "", "");
            /*10*/      tipo_test("", "", "", "", "", "");                     
                    }
                    case "8" -> {
                        System.out.println("\nTEMA " + menu + "\n");
                        
            /*01*/      tipo_test("", "", "", "", "", "");
            /*02*/      tipo_test("", "", "", "", "", "");
            /*03*/      tipo_test("", "", "", "", "", "");
            /*04*/      tipo_test("", "", "", "", "", "");
            /*05*/      tipo_test("", "", "", "", "", "");
            /*06*/      tipo_test("", "", "", "", "", "");
            /*07*/      tipo_test("", "", "", "", "", "");
            /*08*/      tipo_test("", "", "", "", "", "");
            /*09*/      tipo_test("", "", "", "", "", "");
            /*10*/      tipo_test("", "", "", "", "", "");                        
                    }
                    case "9" -> {
                        System.out.println("\nTEMA " + menu + "\n");
                        
             /*01*/      tipo_test("", "", "", "", "", "");
            /*02*/      tipo_test("", "", "", "", "", "");
            /*03*/      tipo_test("", "", "", "", "", "");
            /*04*/      tipo_test("", "", "", "", "", "");
            /*05*/      tipo_test("", "", "", "", "", "");
            /*06*/      tipo_test("", "", "", "", "", "");
            /*07*/      tipo_test("", "", "", "", "", "");
            /*08*/      tipo_test("", "", "", "", "", "");
            /*09*/      tipo_test("", "", "", "", "", "");
            /*10*/      tipo_test("", "", "", "", "", "");                        
                    }
                    case "10" -> {
                        System.out.println("\nTEMA " + menu + "\n");
                        
            /*01*/      tipo_test("", "", "", "", "", "");
            /*02*/      tipo_test("", "", "", "", "", "");
            /*03*/      tipo_test("", "", "", "", "", "");
            /*04*/      tipo_test("", "", "", "", "", "");
            /*05*/      tipo_test("", "", "", "", "", "");
            /*06*/      tipo_test("", "", "", "", "", "");
            /*07*/      tipo_test("", "", "", "", "", "");
            /*08*/      tipo_test("", "", "", "", "", "");
            /*09*/      tipo_test("", "", "", "", "", "");
            /*10*/      tipo_test("", "", "", "", "", "");                        
                    }
                    case "11" -> {
                        System.out.println("\nTEMA " + menu + "\n");
                        
            /*01*/      tipo_test("", "", "", "", "", "");
            /*02*/      tipo_test("", "", "", "", "", "");
            /*03*/      tipo_test("", "", "", "", "", "");
            /*04*/      tipo_test("", "", "", "", "", "");
            /*05*/      tipo_test("", "", "", "", "", "");
            /*06*/      tipo_test("", "", "", "", "", "");
            /*07*/      tipo_test("", "", "", "", "", "");
            /*08*/      tipo_test("", "", "", "", "", "");
            /*09*/      tipo_test("", "", "", "", "", "");
            /*10*/      tipo_test("", "", "", "", "", "");                        
                    }
                    case "12" -> {
                        System.out.println("\nTEMA " + menu + "\n");
                        
            /*01*/      tipo_test("", "", "", "", "", "");
            /*02*/      tipo_test("", "", "", "", "", "");
            /*03*/      tipo_test("", "", "", "", "", "");
            /*04*/      tipo_test("", "", "", "", "", "");
            /*05*/      tipo_test("", "", "", "", "", "");
            /*06*/      tipo_test("", "", "", "", "", "");
            /*07*/      tipo_test("", "", "", "", "", "");
            /*08*/      tipo_test("", "", "", "", "", "");
            /*09*/      tipo_test("", "", "", "", "", "");
            /*10*/      tipo_test("", "", "", "", "", "");                       
                    }
                    case "13" -> {
                        System.out.println("\nTEMA " + menu + "\n");
                        
            /*01*/      tipo_test("", "", "", "", "", "");
            /*02*/      tipo_test("", "", "", "", "", "");
            /*03*/      tipo_test("", "", "", "", "", "");
            /*04*/      tipo_test("", "", "", "", "", "");
            /*05*/      tipo_test("", "", "", "", "", "");
            /*06*/      tipo_test("", "", "", "", "", "");
            /*07*/      tipo_test("", "", "", "", "", "");
            /*08*/      tipo_test("", "", "", "", "", "");
            /*09*/      tipo_test("", "", "", "", "", "");
            /*10*/      tipo_test("", "", "", "", "", "");                        
                    }
                    case "14" -> {
                        System.out.println("\nTEMA " + menu + "\n");
                        
            /*01*/      tipo_test("", "", "", "", "", "");
            /*02*/      tipo_test("", "", "", "", "", "");
            /*03*/      tipo_test("", "", "", "", "", "");
            /*04*/      tipo_test("", "", "", "", "", "");
            /*05*/      tipo_test("", "", "", "", "", "");
            /*06*/      tipo_test("", "", "", "", "", "");
            /*07*/      tipo_test("", "", "", "", "", "");
            /*08*/      tipo_test("", "", "", "", "", "");
            /*09*/      tipo_test("", "", "", "", "", "");
            /*10*/      tipo_test("", "", "", "", "", "");                        
                    }
                    case "15" -> {
                        System.out.println("\nTEMA " + menu + "\n");
                        
            /*01*/      tipo_test("", "", "", "", "", "");
            /*02*/      tipo_test("", "", "", "", "", "");
            /*03*/      tipo_test("", "", "", "", "", "");
            /*04*/      tipo_test("", "", "", "", "", "");
            /*05*/      tipo_test("", "", "", "", "", "");
            /*06*/      tipo_test("", "", "", "", "", "");
            /*07*/      tipo_test("", "", "", "", "", "");
            /*08*/      tipo_test("", "", "", "", "", "");
            /*09*/      tipo_test("", "", "", "", "", "");
            /*10*/      tipo_test("", "", "", "", "", "");                        
                    }
                    
                    case "0" -> {}
                    default -> System.out.println("\n  ��� LA OPCI�N NO ES CORRECTA !!!");
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.toString());
                System.out.println("MENSAJE " + e.getMessage());
                System.out.println("La Excepci�n es: " + e.getClass());
            }
        } while (!"0".equals(menu));
    }
    
}
