package Pages;

import Helpers.Helper;
import Hooks.InitialHooks;
import io.appium.java_client.AppiumBy;

public class VocabularyPage extends InitialHooks {

    Helper helper = new Helper();

    public void adminTapBeginItem() {
        switchAdminDriver();
        helper.wait(6000);
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Begin items\"]")).click();
        helper.wait(1000);
    }

    public void adminSelectTheCorrectResponseFrom28T060(int item) {
        switch (item) {
            case 28 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
               /* driver.findElement(AppiumBy.id("Necessary")).click();
                driver.findElement(AppiumBy.id("Critical")).click();
                driver.findElement(AppiumBy.id("Must-have")).click();
                driver.findElement(AppiumBy.id("Required")).click();
                driver.findElement(AppiumBy.id("Vital")).click();
                driver.findElement(AppiumBy.id("Very important \uEE3F")).click();
                driver.findElement(AppiumBy.id("Important \uEE3F")).click();
                driver.findElement(AppiumBy.id("Really helpful")).click();
                driver.findElement(AppiumBy.id("The main idea of something")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 29 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
                /*driver.findElement(AppiumBy.id("A learned pattern of behavior")).click();
                driver.findElement(AppiumBy.id("Something someone does, frequently without thinking or realizing they have done it")).click();
                driver.findElement(AppiumBy.id("A type of clothing worn by certain religions")).click();
                driver.findElement(AppiumBy.id("Biting your fingernails without thinking")).click();
                driver.findElement(AppiumBy.id("A place where animals tend to live")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 30 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
              /*  driver.findElement(AppiumBy.id("Something that obstructs or gets in the way or slows progress or blocks the way")).click();
                driver.findElement(AppiumBy.id("Something in the road")).click();
                driver.findElement(AppiumBy.id("Something you have to jump over")).click();
                driver.findElement(AppiumBy.id("Something in your path")).click();
                driver.findElement(AppiumBy.id("A police car")).click();
                driver.findElement(AppiumBy.id("A dam")).click();
                driver.findElement(AppiumBy.id("A course \uEE3F")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 31 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
               /* driver.findElement(AppiumBy.id("Polite")).click();
                driver.findElement(AppiumBy.id("Practicing good manners")).click();
                driver.findElement(AppiumBy.id("Being nice to people")).click();
                driver.findElement(AppiumBy.id("Being respectful")).click();
                driver.findElement(AppiumBy.id("Being a nice person all the time")).click();
                driver.findElement(AppiumBy.id("Taking turns")).click();
                driver.findElement(AppiumBy.id("Saying thank you")).click();
                driver.findElement(AppiumBy.id("Not breaking in line \uEE3F")).click();
                driver.findElement(AppiumBy.id("Always willing to talk to someone")).click();
                driver.findElement(AppiumBy.id("Being short with people")).click();
                driver.findElement(AppiumBy.id("Cutting people off")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 32 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
               /* driver.findElement(AppiumBy.id("Of the finest, most expensive or richest kind")).click();
                driver.findElement(AppiumBy.id("Pleasure loving with lack of concern for cost")).click();
                driver.findElement(AppiumBy.id("Extremely comfortable, elegant or enjoyable, especially in a way that involves great expense")).click();
                driver.findElement(AppiumBy.id("Expensive, costly")).click();
                driver.findElement(AppiumBy.id("Fashionable")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 33 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
               /* driver.findElement(AppiumBy.id("Unclear")).click();
                driver.findElement(AppiumBy.id("Having multiple possible meanings")).click();
                driver.findElement(AppiumBy.id("Ambivalent")).click();
                driver.findElement(AppiumBy.id("Confusing")).click();
                driver.findElement(AppiumBy.id("Very big")).click();
                driver.findElement(AppiumBy.id("Very large")).click();
                driver.findElement(AppiumBy.id("Ambitious")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 34 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
               /* driver.findElement(AppiumBy.id("Feeling guilty at having done something wrong")).click();
                driver.findElement(AppiumBy.id("Feeling guilty at having done something that someone did not like")).click();
                driver.findElement(AppiumBy.id("Feeling guilty at having done something that had bad consequences")).click();
                driver.findElement(AppiumBy.id("Distress or guilt for past wrongs or for contributing to the occurrence of undesired consequences")).click();
                driver.findElement(AppiumBy.id("Distress or guilt for past wrongs or for contributing to the occurrence of undesired consequences")).click();
                driver.findElement(AppiumBy.id("Feeling bad for a friend")).click();
                driver.findElement(AppiumBy.id("To repeat a Morse code message")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 35 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
               /* driver.findElement(AppiumBy.id("Extraordinary")).click();
                driver.findElement(AppiumBy.id("Exceptional")).click();
                driver.findElement(AppiumBy.id("Far beyond normal expectations")).click();
                driver.findElement(AppiumBy.id("Unique")).click();
                driver.findElement(AppiumBy.id("Surprising")).click();
                driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Not expected\"]")).click();
                driver.findElement(AppiumBy.id("Not present")).click();
                driver.findElement(AppiumBy.id("Absent")).click();
                driver.findElement(AppiumBy.id("Out of order")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 36 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
                /*driver.findElement(AppiumBy.id("Hard to convince")).click();
                driver.findElement(AppiumBy.id("Having doubts about many things")).click();
                driver.findElement(AppiumBy.id("Being a doubting Thomas")).click();
                driver.findElement(AppiumBy.id("Requiring proof before believing something")).click();
                driver.findElement(AppiumBy.id("Not believing something just because someone else believes it")).click();
                driver.findElement(AppiumBy.id("Hard-headed")).click();
                driver.findElement(AppiumBy.id("Doubting \uEE3F")).click();
                driver.findElement(AppiumBy.id("Argumentative")).click();
                driver.findElement(AppiumBy.id("Uninformed")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 37 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
             /*   driver.findElement(AppiumBy.id("A theory without strong evidence")).click();
                driver.findElement(AppiumBy.id("An intelligent guess")).click();
                driver.findElement(AppiumBy.id("An investment that has a risk of loss")).click();
                driver.findElement(AppiumBy.id("Engaging in a somewhat risky business transaction")).click();
                driver.findElement(AppiumBy.id("A guess")).click();
                driver.findElement(AppiumBy.id("A bet on something happening")).click();
                driver.findElement(AppiumBy.id("Based on little specs of information")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 38 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
              /*  driver.findElement(AppiumBy.id("Rich")).click();
                driver.findElement(AppiumBy.id("Wealthy")).click();
                driver.findElement(AppiumBy.id("Having financial success")).click();
                driver.findElement(AppiumBy.id("Materially successful")).click();
                driver.findElement(AppiumBy.id("Well off")).click();
                driver.findElement(AppiumBy.id("Happy")).click();
                driver.findElement(AppiumBy.id("Healthy")).click();
                driver.findElement(AppiumBy.id("Trying really hard")).click();
                driver.findElement(AppiumBy.id("Extravagant")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 39 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
               /* driver.findElement(AppiumBy.id("Brave")).click();
                driver.findElement(AppiumBy.id("Bold")).click();
                driver.findElement(AppiumBy.id("Daring")).click();
                driver.findElement(AppiumBy.id("Fearless")).click();
                driver.findElement(AppiumBy.id("Recklessly brave")).click();
                driver.findElement(AppiumBy.id("Daring without apparent concern for danger")).click();
                driver.findElement(AppiumBy.id("Not acting like a coward \uEE3F")).click();
                driver.findElement(AppiumBy.id("Having courage")).click();
                driver.findElement(AppiumBy.id("Very loud and boisterous")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 40 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
               /* driver.findElement(AppiumBy.id("Something that regularly comes before something else")).click();
                driver.findElement(AppiumBy.id("Going or coming before")).click();
                driver.findElement(AppiumBy.id("Preceding")).click();
                driver.findElement(AppiumBy.id("Predecessor")).click();
                driver.findElement(AppiumBy.id("Before \uEE3F")).click();
                driver.findElement(AppiumBy.id("To be against something")).click();
                driver.findElement(AppiumBy.id("When something causes something else to happen")).click();
                driver.findElement(AppiumBy.id("A cause")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 41 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
               /* driver.findElement(AppiumBy.id("Unwarranted or unwanted interference in someone else's affairs")).click();
                driver.findElement(AppiumBy.id("Trying to help without being asked")).click();
                driver.findElement(AppiumBy.id("Interfering")).click();
                driver.findElement(AppiumBy.id("Trying to help")).click();
                driver.findElement(AppiumBy.id("Getting involved with something")).click();
                driver.findElement(AppiumBy.id("Gossiping")).click();
                driver.findElement(AppiumBy.id("Coping well with diversity")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 42, 43 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
               /* driver.findElement(AppiumBy.id("An apparently plausible argument using false or invalid inference or logic to deceive or mislead")).click();
                driver.findElement(AppiumBy.id("A deceptive and untrue, mistaken or false statement")).click();
                driver.findElement(AppiumBy.id("A false or misleading claim, notion or belief")).click();
                driver.findElement(AppiumBy.id("A false argument or belief")).click();
                driver.findElement(AppiumBy.id("Not true")).click();
                driver.findElement(AppiumBy.id("Having something to do with fall")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 44 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
               /* driver.findElement(AppiumBy.id("To gradually advance beyond normally accepted limits, boundaries or territories")).click();
                driver.findElement(AppiumBy.id("To infringe upon")).click();
                driver.findElement(AppiumBy.id("To intrude upon someone's territory")).click();
                driver.findElement(AppiumBy.id("To go past the usual limits")).click();
                driver.findElement(AppiumBy.id("To go over the line")).click();
                driver.findElement(AppiumBy.id("A bug")).click();
                driver.findElement(AppiumBy.id("An insect you find in kitchens")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 45 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
               /* driver.findElement(AppiumBy.id("To scheme")).click();
                driver.findElement(AppiumBy.id("To devise or plan especially with negative intent or at someone else's expense")).click();
                driver.findElement(AppiumBy.id("To create or plan")).click();
                driver.findElement(AppiumBy.id("Feeling guilty")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 46 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
               /* driver.findElement(AppiumBy.id("Apathy")).click();
                driver.findElement(AppiumBy.id("Disinterest in something")).click();
                driver.findElement(AppiumBy.id("Lack of concern or caring about something")).click();
                driver.findElement(AppiumBy.id("Open minded \uEE3F")).click();
                driver.findElement(AppiumBy.id("Boredom")).click();
                driver.findElement(AppiumBy.id("The same")).click();
                driver.findElement(AppiumBy.id("Not different")).click();
                driver.findElement(AppiumBy.id("Care free")).click();
                driver.findElement(AppiumBy.id("Playfulness")).click();
                driver.findElement(AppiumBy.id("Uninformed")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 47 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
               /* driver.findElement(AppiumBy.id("A state of balance between forces")).click();
                driver.findElement(AppiumBy.id("When opposing forces are balanced or equal")).click();
                driver.findElement(AppiumBy.id("A calm state of mind")).click();
                driver.findElement(AppiumBy.id("Stability")).click();
                driver.findElement(AppiumBy.id("When things are at an equilibrium they are not likely to change")).click();
                driver.findElement(AppiumBy.id("Not different")).click();
                driver.findElement(AppiumBy.id("Something that is fair to all")).click();
                driver.findElement(AppiumBy.id("Equal")).click();
                driver.findElement(AppiumBy.id("A drug you take when you are nervous")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 48 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
              /*  driver.findElement(AppiumBy.id("Af")).click();
                driver.findElement(AppiumBy.id("To resolve differences")).click();
                driver.findElement(AppiumBy.id("To reach agreement to a resolution of a problem or issue")).click();
                driver.findElement(AppiumBy.id("To make one consistent with another")).click();
                driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"To make amends\"]")).click();
                driver.findElement(AppiumBy.id("To bring into agreement \uEE3F")).click();
                driver.findElement(AppiumBy.id("To make up \uEE3F")).click();
                driver.findElement(AppiumBy.id("Agree")).click();
                driver.findElement(AppiumBy.id("To find out")).click();
                driver.findElement(AppiumBy.id("To look for mistakes")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 49 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
               /* driver.findElement(AppiumBy.id("Absolutely necessary")).click();
                driver.findElement(AppiumBy.id("Essential")).click();
                driver.findElement(AppiumBy.id("Vital")).click();
                driver.findElement(AppiumBy.id("Required")).click();
                driver.findElement(AppiumBy.id("Can't live without")).click();
                driver.findElement(AppiumBy.id("Very important")).click();
                driver.findElement(AppiumBy.id("Desirable")).click();
                driver.findElement(AppiumBy.id("Can't be given to others")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 50 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
               /* driver.findElement(AppiumBy.id("To attempt to be like or imitate")).click();
                driver.findElement(AppiumBy.id("To model after")).click();
                driver.findElement(AppiumBy.id("To strive to be equal to or to excel someone else's performance")).click();
                driver.findElement(AppiumBy.id("To try to dress like someone else")).click();
                driver.findElement(AppiumBy.id("To try to sing like a star")).click();
                driver.findElement(AppiumBy.id("To pretend")).click();
                driver.findElement(AppiumBy.id("To mock")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 51 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
               /* driver.findElement(AppiumBy.id("A blindly accepted belief or idea not based on reason or known facts")).click();
                driver.findElement(AppiumBy.id("A belief held by our grandparents that some still believe in")).click();
                driver.findElement(AppiumBy.id("A real old belief")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 52 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
               /* driver.findElement(AppiumBy.id("Truthfulness")).click();
                driver.findElement(AppiumBy.id("Accuracy")).click();
                driver.findElement(AppiumBy.id("Conforming to factual evidence")).click();
                driver.findElement(AppiumBy.id("Not lying")).click();
                driver.findElement(AppiumBy.id("Honesty \uEE3F")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 53 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
              /*  driver.findElement(AppiumBy.id("Having unresolvable differences")).click();
                driver.findElement(AppiumBy.id("Having differences so far apart that they cannot be resolved")).click();
                driver.findElement(AppiumBy.id("Having differences so far apart that a compromise is not possible")).click();
                driver.findElement(AppiumBy.id("Inability to agree on most important things")).click();
                driver.findElement(AppiumBy.id("When two people don’t agree")).click();
                driver.findElement(AppiumBy.id("Not able to be calmed down")).click();
                driver.findElement(AppiumBy.id("Uncompromising")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 54 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
               /*driver.findElement(AppiumBy.id("Hiding one's true intentions through deceptive words or actions")).click();
                driver.findElement(AppiumBy.id("Deceitfulness")).click();
                driver.findElement(AppiumBy.id("Double-dealing")).click();
                driver.findElement(AppiumBy.id("Being evasive")).click();
                driver.findElement(AppiumBy.id("Having a split personality")).click();
                driver.findElement(AppiumBy.id("Beating around the bush")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 55 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
              /*  driver.findElement(AppiumBy.id("Something generally assumed to be but is not necessarily true")).click();
                driver.findElement(AppiumBy.id("An unproven idea")).click();
                driver.findElement(AppiumBy.id("An unproven assumption")).click();
                driver.findElement(AppiumBy.id("An unverified statement")).click();
                driver.findElement(AppiumBy.id("An informed but unproven idea")).click();
                driver.findElement(AppiumBy.id("A guess")).click();
                driver.findElement(AppiumBy.id("A theory")).click();
                driver.findElement(AppiumBy.id("Something that is supposed to be")).click();
                driver.findElement(AppiumBy.id("Something that should be")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 56 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
               /* driver.findElement(AppiumBy.id("Giving or indicating a good change of success")).click();
                driver.findElement(AppiumBy.id("Favorable")).click();
                driver.findElement(AppiumBy.id("Looking good")).click();
                driver.findElement(AppiumBy.id("Having good luck")).click();
                driver.findElement(AppiumBy.id("Successful")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 57 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
             /*   driver.findElement(AppiumBy.id("Losing the ability to adapt")).click();
                driver.findElement(AppiumBy.id("Becoming rigid and unresponsive")).click();
                driver.findElement(AppiumBy.id("Relating to or having sclerosis")).click();
                driver.findElement(AppiumBy.id("Something to do with the arteries")).click();
                driver.findElement(AppiumBy.id("Some kind of neurological disorder")).click();
                driver.findElement(AppiumBy.id("Sick")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 58 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
                /*driver.findElement(AppiumBy.id("Wise")).click();
                driver.findElement(AppiumBy.id("Intelligent")).click();
                driver.findElement(AppiumBy.id("Shrewd")).click();
                driver.findElement(AppiumBy.id("Very knowledgeable")).click();
                driver.findElement(AppiumBy.id("Smart")).click();
                driver.findElement(AppiumBy.id("Above average")).click();
                driver.findElement(AppiumBy.id("Having to do with the stars")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 59 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
               /* driver.findElement(AppiumBy.id("To free from blame or guilt")).click();
                driver.findElement(AppiumBy.id("To pardon")).click();
                driver.findElement(AppiumBy.id("To forgive")).click();
                driver.findElement(AppiumBy.id("To clear from unproven fault or guilt")).click();
                driver.findElement(AppiumBy.id("Not wrong")).click();
                driver.findElement(AppiumBy.id("To expel from a church")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 60 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
                /*driver.findElement(AppiumBy.id("Juvenile")).click();
                driver.findElement(AppiumBy.id("Childish")).click();
                driver.findElement(AppiumBy.id("Immature")).click();
                driver.findElement(AppiumBy.id("Acting too young for your age")).click();
                driver.findElement(AppiumBy.id("Inappropriate")).click();
                driver.findElement(AppiumBy.id("Unacceptable")).click();
                driver.findElement(AppiumBy.id("Impolite")).click();
                driver.findElement(AppiumBy.id("Pure")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            default -> {
            }
        }
    }

    public void adminSelectTheCorrectResponseFrom24To27(int item) {
        switch (item) {
            case 24 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
              /* driver.findElement(AppiumBy.id("Afraid")).click();
                driver.findElement(AppiumBy.id("Fearful")).click();
                driver.findElement(AppiumBy.id("Frightened")).click();
                driver.findElement(AppiumBy.id("Anxious")).click();
                driver.findElement(AppiumBy.id("Alarmed")).click();
                driver.findElement(AppiumBy.id("Afraid something is going to happen to you")).click();
                driver.findElement(AppiumBy.id("Something might hurt you")).click();
                driver.findElement(AppiumBy.id("When you want to run away \uEE3F")).click();
                driver.findElement(AppiumBy.id("Not liking something")).click();
                driver.findElement(AppiumBy.id("Being annoyed at something")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 25 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
               /*driver.findElement(AppiumBy.id("Not ever")).click();
                driver.findElement(AppiumBy.id("At no time in the past, present or future")).click();
                driver.findElement(AppiumBy.id("Not possible")).click();
                driver.findElement(AppiumBy.id("I should never hit April again")).click();
                driver.findElement(AppiumBy.id("Where Peter Pan lives")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 26 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
                /*driver.findElement(AppiumBy.id("Extraordinary")).click();
                driver.findElement(AppiumBy.id("Outstanding")).click();
                driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Superb\"]")).click();
                driver.findElement(AppiumBy.id("Awesome")).click();
                driver.findElement(AppiumBy.id("Truly impressive")).click();
                driver.findElement(AppiumBy.id("Great")).click();
                driver.findElement(AppiumBy.id("Very good")).click();
                driver.findElement(AppiumBy.id("Magnified a lot")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 27 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
                /*driver.findElement(AppiumBy.id("To have interest in new things or information")).click();
                driver.findElement(AppiumBy.id("Eager to know about things")).click();
                driver.findElement(AppiumBy.id("Asking questions \uEE3F")).click();
                driver.findElement(AppiumBy.id("Very active")).click();
                driver.findElement(AppiumBy.id("Outgoing")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            default -> {
            }
        }
    }

    public void adminSelectTheCorrectResponseFrom20T023(int item) {
        switch (item) {
            case 20 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
               /* driver.findElement(AppiumBy.id("To look around to see what is there")).click();
                driver.findElement(AppiumBy.id("To search")).click();
                driver.findElement(AppiumBy.id("To go places")).click();
                driver.findElement(AppiumBy.id("To check out something \uEE3F")).click();
                driver.findElement(AppiumBy.id("To hide")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 21 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
               /* driver.findElement(AppiumBy.id("The same")).click();
                driver.findElement(AppiumBy.id("Equivalent")).click();
                driver.findElement(AppiumBy.id("Having the same value")).click();
                driver.findElement(AppiumBy.id("Comparable")).click();
                driver.findElement(AppiumBy.id("About the same")).click();
                driver.findElement(AppiumBy.id("Not varying")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 22 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
                /*driver.findElement(AppiumBy.id("Liked or preferred most")).click();
                driver.findElement(AppiumBy.id("A person treated with special favor and/or especially liked")).click();
                driver.findElement(AppiumBy.id("First among others")).click();
                driver.findElement(AppiumBy.id("Special")).click();
                driver.findElement(AppiumBy.id("Really important to someone")).click();
                driver.findElement(AppiumBy.id("Mine not yours, my toy")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 23 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
              /*  driver.findElement(AppiumBy.id("Odd")).click();
                driver.findElement(AppiumBy.id("Very different")).click();
                driver.findElement(AppiumBy.id("Out of the ordinary")).click();
                driver.findElement(AppiumBy.id("Alien")).click();
                driver.findElement(AppiumBy.id("Unusual or very unusual")).click();
                driver.findElement(AppiumBy.id("Unexpected")).click();
                driver.findElement(AppiumBy.id("Acting funny")).click();
                driver.findElement(AppiumBy.id("Something from outer space")).click();
                driver.findElement(AppiumBy.id("Inappropriate")).click();
                driver.findElement(AppiumBy.id("Unacceptable")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            default -> {
            }
        }
    }


    public void adminTapCompleteButton() {
        switchAdminDriver();
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Complete\"]")).click();
    }

    public void adminTapBeginItemsForVocabularyPictures() {
        switchAdminDriver();
        driver.findElement(AppiumBy.id("Begin items")).click();
        helper.wait(2000);
        switchClientDriver();
    }

    public void adminSelectTheCorrectResponse(int age, int item) {
        if ((age == 5) || (age == 6)) {
            clientSelectCorrectOptionForVocabularyPictures(item);
            adminSelectTheCorrectResponseFrom8T015(item);
            adminSelectTheCorrectResponseFrom16T019(item);
            adminSelectTheCorrectResponseFrom20T023(item);
            adminSelectTheCorrectResponseFrom24To27(item);
            adminSelectTheCorrectResponseFrom28T060(item);
        } else if ((age == 7) || (age == 8) || (age == 9)) {
            adminSelectTheCorrectResponseFrom16T019(item);
            adminSelectTheCorrectResponseFrom20T023(item);
            adminSelectTheCorrectResponseFrom24To27(item);
            adminSelectTheCorrectResponseFrom28T060(item);
        } else if ((age == 10) || (age == 11) || (age == 12)) {
            adminSelectTheCorrectResponseFrom20T023(item);
            adminSelectTheCorrectResponseFrom24To27(item);
            adminSelectTheCorrectResponseFrom28T060(item);
        } else if ((age == 13) || (age == 14)) {
            adminSelectTheCorrectResponseFrom24To27(item);
            adminSelectTheCorrectResponseFrom28T060(item);
        } else if (age > 14) {
            adminSelectTheCorrectResponseFrom28T060(item);
        }
    }

    public void clientSelectCorrectOptionForVocabularyPictures(int item) {
        helper.wait(1000);
        switch (item) {
            case 1 -> {
                driver2.findElement(AppiumBy.id("vocabulary_pictures_item_197232")).click();
            }
            case 2 -> {
                driver2.findElement(AppiumBy.id("vocabulary_pictures_item_2429232")).click();
            }
            case 3 -> {
                driver2.findElement(AppiumBy.id("vocabulary_pictures_item_397232")).click();
            }
            case 4 -> {
                driver2.findElement(AppiumBy.id("vocabulary_pictures_item_4429564")).click();
            }
            case 5 -> {
                driver2.findElement(AppiumBy.id("vocabulary_pictures_item_5429232")).click();
            }
            case 6 -> {
                driver2.findElement(AppiumBy.id("vocabulary_pictures_item_6429564")).click();
            }
            case 7 -> {
                driver2.findElement(AppiumBy.id("vocabulary_pictures_item_797564")).click();
            }
            default -> {
            }
        }
    }

    public void adminSelectTheCorrectResponseFrom8T015(int item) {
        switch (item) {
            case 8 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
               /* driver.findElement(AppiumBy.id("Something used to wear on the human foot")).click();
                driver.findElement(AppiumBy.id("A metal plate to cover the foot of an animal")).click();
                driver.findElement(AppiumBy.id("Boot")).click();
                driver.findElement(AppiumBy.id("Tennis shoe")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 9 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
               /* driver.findElement(AppiumBy.id("A mammal with 4 legs that is used for riding")).click();
                driver.findElement(AppiumBy.id("A game played with a basketball")).click();
                driver.findElement(AppiumBy.id("An animal you find on a farm")).click();
                driver.findElement(AppiumBy.id("Colt or pony")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 10 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
               /* driver.findElement(AppiumBy.id("A small metal tool used to open a lock")).click();
                driver.findElement(AppiumBy.id("A map legend")).click();
                driver.findElement(AppiumBy.id("An important person in a company")).click();
                driver.findElement(AppiumBy.id("Passkey")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 11 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
               /* driver.findElement(AppiumBy.id("A cleaning product ")).click();
                driver.findElement(AppiumBy.id("Something to clean with")).click();
                driver.findElement(AppiumBy.id("Detergent")).click();
                driver.findElement(AppiumBy.id("Wash")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 12 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
               /* driver.findElement(AppiumBy.id("Chime")).click();
                driver.findElement(AppiumBy.id("Something that rings")).click();
                driver.findElement(AppiumBy.id("Doorbell")).click();
                driver.findElement(AppiumBy.id("School bell")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 13 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
               /* driver.findElement(AppiumBy.id("A tool used for light")).click();
                driver.findElement(AppiumBy.id("Torch")).click();
                driver.findElement(AppiumBy.id("Flashlight")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 14 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
               /* driver.findElement(AppiumBy.id("A container")).click();
                driver.findElement(AppiumBy.id("A carton")).click();
                driver.findElement(AppiumBy.id("Bin")).click();
                driver.findElement(AppiumBy.id("Package")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 15 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
                /*driver.findElement(AppiumBy.id("A group of pages between a front and back cover")).click();
                driver.findElement(AppiumBy.id("To make a reservation")).click();
                driver.findElement(AppiumBy.id("Magazine")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            default -> {
            }
        }
    }

    public void adminSelectTheCorrectResponseFrom16T019(int item) {
        switch (item) {

            case 16 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
               /* driver.findElement(AppiumBy.id("To make something easier or faster")).click();
                driver.findElement(AppiumBy.id("That which has been done to aid someone")).click();
                driver.findElement(AppiumBy.id("Someone who provides assistance")).click();
                driver.findElement(AppiumBy.id("What you yell if you are in danger")).click();
                driver.findElement(AppiumBy.id("My sister helped me with my homework")).click();
                driver.findElement(AppiumBy.id("I help wash dishes or clean the table or make bed, etc.")).click();
                driver.findElement(AppiumBy.id("To give someone a hand \uEE3F")).click();
                driver.findElement(AppiumBy.id("Yelling for someone to come")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 17 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
               /* driver.findElement(AppiumBy.id("To have beauty")).click();
                driver.findElement(AppiumBy.id("Pleasant looking")).click();
                driver.findElement(AppiumBy.id("Pleasing")).click();
                driver.findElement(AppiumBy.id("Nice looking")).click();
                driver.findElement(AppiumBy.id("Attractive")).click();
                driver.findElement(AppiumBy.id("Fairly, almost")).click();
                driver.findElement(AppiumBy.id("Very like he's pretty good")).click();
                driver.findElement(AppiumBy.id("A flower is pretty")).click();
                driver.findElement(AppiumBy.id("A dress is pretty")).click();
                driver.findElement(AppiumBy.id("Looks nice")).click();
                driver.findElement(AppiumBy.id("Pleasant \uEE3F")).click();
                driver.findElement(AppiumBy.id("Not ugly \uEE3F")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 18 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
                /*driver.findElement(AppiumBy.id("To put on top of another")).click();
                driver.findElement(AppiumBy.id("Shelves in a library")).click();
                driver.findElement(AppiumBy.id("A pile")).click();
                driver.findElement(AppiumBy.id("To arrange or place in a pile")).click();
                driver.findElement(AppiumBy.id("A bunch of things on top of each other ")).click();
                driver.findElement(AppiumBy.id("A bunch of things on top of each other ")).click();
                driver.findElement(AppiumBy.id("A group of things")).click();
                driver.findElement(AppiumBy.id("A bunch")).click();
                driver.findElement(AppiumBy.id("To put things in a closet")).click();
                driver.findElement(AppiumBy.id("To put up your toys \uEE3F")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            case 19 -> {
                driver.findElement(AppiumBy.id("2 points")).click();
                /*driver.findElement(AppiumBy.id("A person that you like and who likes you")).click();
                driver.findElement(AppiumBy.id("Someone you can be yourself with")).click();
                driver.findElement(AppiumBy.id("Someone who you can trust")).click();
                driver.findElement(AppiumBy.id("Frankie is my friend \uEE3F")).click();
                driver.findElement(AppiumBy.id("Someone you play with \uEE3F")).click();
                driver.findElement(AppiumBy.id("A person that you care about \uEE3F")).click();
                driver.findElement(AppiumBy.id("Someone who gives you stuff")).click();*/
                driver.findElement(AppiumBy.id("right-arrow-1 button")).click();
            }
            default -> {
            }
        }
    }
}

