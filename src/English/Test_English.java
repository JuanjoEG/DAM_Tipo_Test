package English;

import _Main_.Principal;
import java.util.Scanner;
import static _Main_.Principal.tipo_test;

/**
 *
 * @author Juan José Estévez González
 */
public class Test_English {
    
        public static void main(String[] args) {
            
            _Main_.Principal.setAsignatura("ENGLISH");
        
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
        *  5. TEMA: LIKES AND DISLIKES                                         *
        *  6. TEMA: PAST ACTIVITIES                                            *
        *  7. TEMA: FUTURE                                                     *
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
        *  0. ATRÁS.                                                           *
        ************************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                switch (menu) {
                    case "1" -> {
                        _Main_.Principal.setTema(menu);                        
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
                        _Main_.Principal.setTema(menu);
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
                        _Main_.Principal.setTema(menu);
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
                        _Main_.Principal.setTema(menu);
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
                        _Main_.Principal.setTema(menu);
                        System.out.println("\nTEMA " + menu + "\n");
                        
            /*01*/      tipo_test("Which of the following expressions is the most formal?", "I love watching series on Netflix.", "She has a genuine liking for detective stories.", "I hate loud noises.", "I like working in a hospital.", "2");
            /*02*/      tipo_test("If you take offence at something, it means:", "That you like that.", "That you feel upset about it.", "That you have insulted someone.", "That you don't care about it.", "2");
            /*03*/      tipo_test("My sister is completely down with her teacher. This sentences means that:", "My sister hates her teacher.", "My sister loves her teacher.", "My sister annoys her teacher.", "None of the options is correct.", "2");
            /*04*/      tipo_test("Peter dies for dark chocolate. This sentence means that:", "Peter got sick from eating too much dark chocolate.", "Peter hates dark chocolate.", "Peter loves dark chocolate.", "Peter doesn't care about dark chocolate.", "3");
            /*05*/      tipo_test("Which of the following expressions is used to express that you like something?", "It's not my cup of tea.", "To be put off by it.", "To be into it.", "To have no sympathy for it.", "3");
            /*06*/      tipo_test("Which of the following expressions is not used for instructions?", "How do you do?", "Do you want me to?", "What do I do?", "How do I do?", "1");
            /*07*/      tipo_test("Which of the following sentences is incorrect?", "So you're not taking any call in the afternoon, are you?", "We need to arrive at the airport three hours in advance, don't we?", "You have to walk one hour a day to keep fit, don't I?", "They arrive at 5pm, don't they?", "3");
            /*08*/      tipo_test("Choose the right option to complete the sentence:\n        I'm ... I didn't catch that. Could you please say it again?", "Scared", "Afraid", "Mindful", "Frightened", "2");
            /*09*/      tipo_test("What does the following expression mean:\n        To be on the same page / screen", "To be connected to the same website.", "To see the same screen on your laptop / computer.", "To have the same understanding of something.", "To synchronise watches.", "3");
            /*10*/      tipo_test("How can I rephrase the following sentence:\n        Let me go through that again.", "Let me repeat that.", "Let's not go over that again.", "I didn't catch that.", "What is the best way to ...?", "1");                        
                    }
                    case "6" -> {
                        _Main_.Principal.setTema(menu);
                        System.out.println("\nTEMA " + menu + "\n");
                        
            /*01*/      tipo_test("Which of the following expressions is incorrect:", "At weekends, we didn't visited our grandparents.", "At weekends, we always visited our grandparents.", "Did you visit your grandparents at weekends?", "At weekends, we never visited our grandparents.", "1");
            /*02*/      tipo_test("Choose the right option to complete the sentence:\n        I ... football at school. I was very good!", "Played.", "Playd.", "Plaied.", "Playt.", "1");
            /*03*/      tipo_test("Choose the right option to complete the sentence:\n        When my aunt came to visit, she always ... home-made chocolate chip cookies.", "Brought.", "Bringed.", "Broughed.", "Braught.", "1");
            /*04*/      tipo_test("Choose the right option to complete the sentence:\n        I didn't ... the vase. I swear!", "Break.", "Broke.", "Brake.", "Braked.", "1");
            /*05*/      tipo_test("Choose the right option to complete the sentence:\n        When I was a little girl, I ... of becoming an astronaut.", "Both options are correct.", "Dreamed.", "Dreamt.", "None of the options is correct.", "1");
            /*06*/      tipo_test("Choose the right preposition to complete the sentence:\n        Harry arrived ... January 1st.", "On.", "In.", "At.", "Over.", "1");
            /*07*/      tipo_test("Choose the right preposition to complete the sentence:\n        The meeting is scheduled ? 3pm.", "At.", "In.", "On.", "Over.", "1");
            /*08*/      tipo_test("Which of the following sentences is correct?", "I started working for this company a long time ago.", "I started working for this company ago a long time.", "I start working for this company a long time ago.", "I started work for this company ago a long time.", "1");
            /*09*/      tipo_test("Choose the right option to complete the sentence:\n        She came to visit last Saturday and we haven't heard from her ...", "After that.", "Before that.", "Ago.", "All options are incorrect.", "1");
            /*10*/      tipo_test("Which of the following expressions is correct for giving directions?", "Turn right.", "Take the right.", "Spin to the right.", "All options are incorrect.", "1");                        
                    }
                    case "7" -> {
                        _Main_.Principal.setTema(menu);
                        System.out.println("\nTEMA " + menu + "\n");
                        
            /*01*/      tipo_test("Which of the following is not a use of the future simple?", "Predictions based on present evidence.", "Requests.", "Promises.", "Decisions made at the moment of speaking.", "1");
            /*02*/      tipo_test("Which of the following is not a use of the future with GOING TO?", "Plans.", "Offers.", "Intentions.", "Decisions made before the moment of speaking.", "2");
            /*03*/      tipo_test("Choose the right option to complete the sentence: No way! You ... be going to the party!", "Want.", "Wont.", "Wan't.", "Won't.", "4");
            /*04*/      tipo_test("Choose the right option to complete the sentence:\n        I've already booked my next summer holidays.\n        I ... spend a month in Florida!", "am.", "am going to.", "will.", "will going to.", "2");
            /*05*/      tipo_test("Choose the right option to complete the sentence: ... you do me a favour, please?\n        Can you help me to sort out these books?", "Will.", "Are you going to.", "Can you go to.", "None of the options is correct.", "1");
            /*06*/      tipo_test("Which of the following sentences is correct?", "She's not going to play tennis any more.", "She won't going to play tennis any more.", "She're not going to play tennis any more.", "She won't plays tennis any more.", "1");
            /*07*/      tipo_test("Choose the right option to complete the sentence: I ... I totally agree with you.", "See what you mean.", "Watch what you mean.", "Listen to what you mean.", "Hear what you mean.", "1");
            /*08*/      tipo_test("Which of the following is a synonym of \"entirely\" in I entirely agree.", "Partly.", "Somehow.", "Wholeheartedly.", "At times.", "3");
            /*09*/      tipo_test("Choose the right option to complete the sentence: I'm ... I don't agree with you.", "Afraid.", "Scared.", "Frightened.", "Startled.", "1");
            /*10*/      tipo_test("Which of the following expressions is not a synonym of \"totally\" in:\n        I totally disagree with what he said.", "Fundamentally.", "Strongly.", "Up to a point.", "Absolutely.", "3");                     
                    }
                    case "8" -> {
                        _Main_.Principal.setTema(menu);
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
                        _Main_.Principal.setTema(menu);
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
                        _Main_.Principal.setTema(menu);
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
                        _Main_.Principal.setTema(menu);
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
                        _Main_.Principal.setTema(menu);
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
                        _Main_.Principal.setTema(menu);
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
                        _Main_.Principal.setTema(menu);
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
                        _Main_.Principal.setTema(menu);
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
                    default -> System.out.println("\n  ¡¡¡ LA OPCIÓN NO ES CORRECTA !!!");
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.toString());
                System.out.println("MENSAJE " + e.getMessage());
                System.out.println("La Excepción es: " + e.getClass());
            }
        } while (!"0".equals(menu));
    }
    
}
