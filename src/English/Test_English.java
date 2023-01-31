package English;

import _Main_.Menu_Temas;
import static _Main_.Principal.esperar;
import static _Main_.Principal.meterEspacios;
import java.util.Scanner;
import static _Main_.Principal.tipo_test;

/**
 *
 * @author Juan José Estévez González
 */

public class Test_English {
    
    public static void Eng() {
        
        Menu_Temas.setTema_01("INTRODUCTIONS.");
        Menu_Temas.setTema_02("AT PRESENT.");
        Menu_Temas.setTema_03("DATE AND TIME.");
        Menu_Temas.setTema_04("ON THE PHONE.");
        Menu_Temas.setTema_05("LIKES AND DISLIKES.");
        Menu_Temas.setTema_06("PAST ACTIVITIES.");
        Menu_Temas.setTema_07("FUTURE.");
        Menu_Temas.setTema_08("SUGGESTIONS AND COMPLAINTS.");
        Menu_Temas.setTema_09("EVENTS.");
        Menu_Temas.setTema_10("ADJECTIVES.");
        Menu_Temas.setTema_11("TEXTS.");
        Menu_Temas.setTema_12("CONDITIONALS.");
        Menu_Temas.setTema_13("CONDITIONALS II.");
        Menu_Temas.setTema_14("JOB INTERVIEW.");
        Menu_Temas.setTema_15("");
        Menu_Temas.setTema_r1("TEST DE REPASO I.");
        Menu_Temas.setTema_r2("TEST DE REPASO II.");
            
        _Main_.Principal.setAsignatura("ENGLISH");
        
            String menu="";
        do {
            _Main_.Principal.reseteaNotas();
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            Menu_Temas.menu_temas();
            
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                switch (menu) {
                    case "1" -> {
                        _Main_.Principal.setTema(menu); 
        
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
                        
            /*01*/      tipo_test("Which of the following is not a good piece of advice to provide a good customer care\n        service?", "Raise your voice when dealing with aggressive customers.", "Make sure you listen to the customer carefully.", "Make sure to fully understand what the customer needs.", "Apologise for the inconvenience caused.", "1");
            /*02*/      tipo_test("Which of the following statements is true?", "Only what you say matters in customer care.", "Body language is important when dealing with customers.", "You only need you pretend you?re listening to customers.", "Customers don't need your full attention. You have more important things to do.", "2");
            /*03*/      tipo_test("Which of the following statements is a suggestion?", "Will I have to call Mr Smith?", "Do I have to call Mr Smith?", "Shall I call Mr Smith?", "May I call Mr Smith?", "3");
            /*04*/      tipo_test("Choose the right option to complete the sentence:\n        How about ... to replace the product instead of reimbursing the money?", "offer.", "offering.", "to offer.", "offered.", "2");
            /*05*/      tipo_test("Which of the following statements is refusing a suggestion?", "I think I'd rather have my money back.", "That sounds good, thanks.", "That's fine.", "I think it?s a good idea.", "1");
            /*06*/      tipo_test("Which of the following is not a good piece of advice when dealing with an angry\n        customer?", "Get irritated.", "Show empathy.", "Sound positive.", "Sound helpful.", "1");
            /*07*/      tipo_test("Which of the following expressions is used to welcome a customer?", "You're welcome.", "Sorry about that.", "What can I help you with today?", "Help!", "3");
            /*08*/      tipo_test("Which of the following expressions is used to politely express disagreement with a\n        customer?", "I appreciate your situation.", "I understand your position.", "I regret to inform you that this is not our responsibility.", "If I understood you correctly, the problem has to do with a missing piece.", "3");
            /*09*/      tipo_test("Which of the following sentences is incorrect?", "Thanks for wait.", "Please, accept my apologies.", "Could you provide more information please?", "All the sentences are incorrect.", "1");
            /*10*/      tipo_test("Choose the right option to complete the sentence:\n        I ... you that we are doing everything we can to solve this issue.", "Welcome.", "Accept.", "Understand.", "Assure.", "4");                        
                    }
                    case "9" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Which of the following is not in present perfect?", "She's just told her parents about her plans.", "He's never careful with his words.", "She's never been to Ireland.", "He's just returned from his holiday in Barbados.", "2");
            /*02*/      tipo_test("Which of the following sentences is incorrect?", "We have always played football with the local team.", "Mary have always played football with the local team.", "You have always played football with the local team.", "John and Tim have always played football with the local team.", "2");
            /*03*/      tipo_test("Which of the following sentences is correct?", "Have you watched the latest Star Wars movie?", "Do you have watched the latest Star Wars movie?", "You have watch the latest Star Wars movie?", "Did you have watched the latest Star Wars movie?", "1");
            /*04*/      tipo_test("Which of the following sentences is incorrect?", "Sally has worked at the Council of Europe since a very long time.", "We have got on really well since we met.", "I think he's lived in Manchester for three years.", "He didn't withstand that level of pressure for long.", "1");
            /*05*/      tipo_test("Choose the right option to complete the sentence:\n        They have worked together ...", "For the moment the company was founded.", "Since the company headquarters was moved to Liverpool.", "None of the options is correct.", "Both options are correct.", "2");
            /*06*/      tipo_test("Choose the right option to complete the sentence:\n        I haven't spoken to him ...", "Since three years ago.", "For three years.", "Since three years.", "For he left Spain.", "2");
            /*07*/      tipo_test("Choose the right option to complete the sentence:\n        The meeting is due to start in 5 minutes, but Kevin hasn't arrived in the office ...", "Already.", "Never.", "Just.", "Yet.", "4");
            /*08*/      tipo_test("Choose the right option to complete the sentence:\n        I have ... finished the report you asked me to do. Can I go home, now?", "Already.", "Yet.", "Never.", "Ever.", "1");
            /*09*/      tipo_test("Choose the right option to complete the sentence:\n        After making many calls, I ... managed to get through to the person in charge.", "After that.", "As soon as.", "Eventfully.", "Eventually.", "4");
            /*10*/      tipo_test("Choose the right option to complete the sentence:\n        It was important, so I decided to call ... I got the message.", "Finally.", "As soon as.", "Suddenly.", "Finally.", "2");                        
                    }
                    case "10" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Which of the following is incorrect?", "She'd just told me he was coming when he showed up.", "Did you have said to her tell her about the trip?", "I hadn't thought about it.", "All sentences are correct.", "2");
            /*02*/      tipo_test("Choose the right option to complete the sentence:\n        When they arrived at the airport, they realised ...", "They had forgotten their passports at home.", "They forgot to take their passports.", "They have forgotten to take their passports.", "They forget to take their passports.", "1");
            /*03*/      tipo_test("Which of the following sentences is correct?", "Had you finished the report before the meeting?", "Did you finished the report before the meeting?", "Had you finish the report before the meeting?", "Did you have finished the report before the meeting?", "1");
            /*04*/      tipo_test("Which of the following is the right adjective order?", "Age, opinion, size.", "Opinion, size, age.", "Size, age, opinion.", "Size, opinion, age.", "2");
            /*05*/      tipo_test("Which of the following is the right adjective order?", "Nice, old, black man.", "Old, black, nice man.", "Black, old, nice man.", "Black, nice, old man.", "1");
            /*06*/      tipo_test("Choose the right option to complete the sentence:\n        The Eiffel Tower is ... than the tower in Pisa.", "Higher.", "More high.", "As high.", "Highest.", "1");
            /*07*/      tipo_test("Choose the right option to complete the sentence:\n        The meeting on Monday was ... of the year", "The longest.", "Longest.", "Longer.", "The longer.", "1");
            /*08*/      tipo_test("Choose the right option to complete the sentence:\n        I think you look ... with short hair.", "Beautifuller.", "More beautiful.", "Both options are correct.", "None of the options is correct.", "2");
            /*09*/      tipo_test("Which of the following superlatives is correct?", "Happiest.", "Happyest.", "Happyiest.", "Happest.", "1");
            /*10*/      tipo_test("Choose the right option to complete the sentence:\n        It was their ... match ever; they lost 10-0!", "Baddest.", "Worse.", "Badder.", "Worst.", "4");                        
                    }
                    case "11" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("What is a unit of thought that communicates complete meaning, with an internal and\n        external structure?", "An idea.", "A paragraph.", "A text.", "A narrative.", "2");
            /*02*/      tipo_test("Which of the following is not a type of paragraph according to their main function?", "Deductive.", "Inductive.", "All the options are types of paragraph according to their main function.", "Introductory.", "4");
            /*03*/      tipo_test("What type of paragraph is a short paragraph that contributes to the cohesion of the text?", "Transitional.", "Summary.", "Ending.", "Introductory.", "1");
            /*04*/      tipo_test("Which of the following is not a commercial letter?", "Quote.", "Order.", "Letter of complaint.", "Grades.", "4");
            /*05*/      tipo_test("In a cover letter, what information should you include at the top-right corner?", "Your contact details.", "The contact details of the company.", "The salutation.", "Your signature.", "1");
            /*06*/      tipo_test("What type of language should you use in a cover letter?", "Formal.", "Informal.", "Casual.", "It doesn't matter.", "1");
            /*07*/      tipo_test("Choose the correct tip to write a cover letter:", "Don't make it personal, it is best not to address the letter to anyone in particular.", "Don't be too specific so that you can use the same letter to different companies.", "Explain why you chose to write to this company in particular.", "Show them you're strict to prove your professionalism.", "3");
            /*08*/      tipo_test("Which of the following expressions you shouldn't use in a cover letter?", "Dear Mr. Smith ...", "Yours sincerely ...", "I am writing to apply ...", "What's up?", "4");
            /*09*/      tipo_test("Hey! Long time no see! - This expression is used:", "To start a conversation about the weather.", "To say goodbye.", "When you see someone every day at work.", "When you haven't seen someone for a long time.", "4");
            /*10*/      tipo_test("Which expression should you use to ask someone how they're doing in informal language?", "How's it going?", "Nice day, isn't it?", "I look forward to hearing from you soon.", "Have you been waiting long?", "1");                        
                    }
                    case "12" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Zero conditionals are used to convey ...", "General truths.", "Wishes.", "Advice.", "Complaints.", "1");
            /*02*/      tipo_test("First conditionals have the following structure:", "If + present simple / Future simple (will).", "If + would / Future simple (will).", "If + present simple / Future perfect (have).", "If + present simple / present simple.", "1");
            /*03*/      tipo_test("Choose the right option to complete the sentence:\n        If you don't try, you ...", "Will never know if you?re ready.", "Can never know if you?re ready.", "Both options are correct.", "None of the options is correct.", "3");
            /*04*/      tipo_test("Choose the right option to complete the sentence:\n        If you are caught drunk driving ...", "You are fined.", "You were fined.", "You would be fined.", "You had to be fined.", "1");
            /*05*/      tipo_test("Choose the right option to complete the sentence:\n        ... if you need help.", "Call me.", "Called me.", "If you call me.", "Would you call me.", "1");
            /*06*/      tipo_test("Choose the right option to complete the sentence:\n        If you work out a little every day, ...", "You will lose weight.", "You lost weight.", "You would lose weight.", "You would have lost.", "1");
            /*07*/      tipo_test("Choose the correct tip to write a successful CV:", "Adapt it to the company you are applying for.", "Include general skills so that you can use it for different positions.", "Always use a very particular layout to stand up.", "Lie about your professional qualifications to make your CV more interesting.", "1");
            /*08*/      tipo_test("Under 'qualifications' in your CV you must include:", "Your professional experience.", "Your studies.", "Your hobbies.", "Your skills.", "2");
            /*09*/      tipo_test("What type of information should not be included in a CV?", "Name.", "Email address.", "Marital status.", "Additional training.", "3");
            /*10*/      tipo_test("A successful CV is the one that ...", "Gets you a job interview.", "Shows you have a lot of work experience.", "Makes you look better qualified than you really are.", "Shows that you are a very strict and demanding person.", "1");                       
                    }
                    case "13" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Second conditionals are used to convey ...", "General truths.", "Possible, although not real situations.", "Impossible situations in the past.", "Real conditions.", "2");
            /*02*/      tipo_test("Third conditionals have the following structure:", "If + past perfect / Would have.", "If + would / Future simple (will).", "If + past perfect / Would.", "If + past perfect / present simple.", "1");
            /*03*/      tipo_test("Choose the right option to complete the sentence:\n        If he hadn't driven so fast, ...", "The accident wouldn't have happened.", "The accident haven't happened.", "The accident hadn't happened.", "The accident doesn't happen.", "1");
            /*04*/      tipo_test("Choose the right option to complete the sentence:\n        You might still pass the subject, ...", "If you had studied hard.", "If you studied hard.", "If you would study hard.", "If you would have studied hard.", "2");
            /*05*/      tipo_test("Choose the right option to complete the sentence:\n        ... you listened to the radio in English every day,\n        your pronunciation would be much better.", "Unless.", "Provided that.", "Maybe.", "Could.", "2");
            /*06*/      tipo_test("Which of the following sentences is incorrect?", "If I saw that coming, I would have made a different decision.", "If I had known what would happen, I would have acted differently.", "Both sentences are correct.", "Both sentences are incorrect.", "1");
            /*07*/      tipo_test("Which of the following expressions is used to thank somebody?", "I appreciate that.", "I'm sorry.", "That sounds great.", "Never mind.", "1");
            /*08*/      tipo_test("Which of the following expressions means the same as 'Just forget it':", "It doesn't matter.", "I'm sorry.", "Please, call me back.", "What do you think?", "1");
            /*09*/      tipo_test("Choose the right option to complete the sentence:\n        I'm so ...! We're going to Ireland in the summer.", "Excited.", "Exciting.", "None of the options is correct.", "Both options are correct.", "1");
            /*10*/      tipo_test("Choose the right option to complete the sentence:\n        You didn't seem to like the film. You looked so ...", "Bored.", "Boring.", "None of the options is correct.", "Both options are correct.", "1");                        
                    }
                    case "14" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Which of the following is not a piece of information usually provided by employers\n        during a job interview?", "Next stage in the selection process.", "The company financial statement.", "Complementary information on the job.", "Additional information on the company.", "2");
            /*02*/      tipo_test("Which is the recruiter's main objective of a job interview?", "Establish the person's salary.", "Fix their holidays.", "Make a judgement about the candidate.", "Design the company strategy.", "3");
            /*03*/      tipo_test("Choose the right option to complete the sentence:\n        In addition to your strengths, employers also want to know about your ...", "Weaknesses.", "Hair colour.", "Music tastes.", "Food habits.", "1");
            /*04*/      tipo_test("Choose the right option to complete the sentence:\n        In a job interview, you should show you ... overwork.", "Are tolerant about.", "Are not keen on.", "Will not.", "Refuse to.", "1");
            /*05*/      tipo_test("Broadly speaking, a general tip for an interview is not to show you are too:", "Efficient.", "Clean.", "Self-confident.", "Hard-working.", "3");
            /*06*/      tipo_test("Which of the following is not a typical question at a job interview?", "Shall we go for lunch?", "Tell me about yourself.", "What are your salary expectations?", "Do you have any question for us?", "1");
            /*07*/      tipo_test("Choose the right option to complete the sentence:\n        Which of the job ... can I fulfill better?", "Colleagues.", "Wages.", "Requirements.", "Errors.", "3");
            /*08*/      tipo_test("While doing a job interview on the phone it is a good idea to be:", "In the kitchen.", "In a signal reception area.", "In the park.", "In bed.", "2");
            /*09*/      tipo_test("Choose the right option to complete the sentence:\n        Which are your long-term ... ?", "Achievings.", "Goals.", "Expects.", "All the options are incorrect.", "2");
            /*10*/      tipo_test("Which of the following words is a synonym of 'job' in Why are you applying for this job?", "Position.", "Place.", "Location.", "Office.", "1");                        
                    }
                    case "15" -> {
                        _Main_.Principal.setTema(menu);
                        
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
                    default -> {
                            meterEspacios(25);
                            System.out.println("\n  ¡¡¡ LA OPCIÓN NO ES CORRECTA !!!");
                            meterEspacios(15);
                            esperar(1500);
                            }
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.toString());
                System.out.println("MENSAJE " + e.getMessage());
                System.out.println("La Excepción es: " + e.getClass());
            }
        } while (!"0".equals(menu));
    }
    
}
