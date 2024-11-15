public class MBTIDescriptions {

	public void descriptionSwitch(String mbtiType) {

	switch (mbtiType) {
		case "INTJ":
			System.out.println("The Architect: Imaginative and strategic thinkers with a plan for everything.");
		break;
		case "INTP":
			System.out.println("The Logician: Innovative inventors with an unquenchable thirst for knowledge.");
		break;
		case "ENTJ":
			System.out.println("The Commander: Bold, imaginative, and strong-willed leaders, always finding a way.");
		break;
		case "ENTP":
			System.out.println("The Debater: Smart and curious thinkers who cannot resist an intellectual challenge.");
		break;
		case "INFJ":
			System.out.println("The Advocate: Quiet and mystical, yet very inspiring and tireless idealists.");
		break;
		case "INFP":
			System.out.println("The Mediator: Poetic, kind, and altruistic people, always eager to help a good cause.");
		break;
		case "ENFJ":
			System.out.println("The Protagonist: Charismatic and inspiring leaders, able to mesmerize their listeners.");
		break;
		case "ENFP":
			System.out.println("The Campaigner: Enthusiastic, creative, and sociable free spirits, always finding joy.");
		break;
		case "ISTJ":
			System.out.println("The Logistician: Practical and fact-minded individuals, whose reliability cannot be doubted.");
		break;
		case "ISFJ":
			System.out.println("The Defender: Very dedicated and warm protectors, always ready to defend loved ones.");
		break;
		case "ESTJ":
			System.out.println("The Executive: Excellent administrators, unsurpassed at managing things—or people.");
		break;
		case "ESFJ":
			System.out.println("The Consul: Extraordinarily caring, social, and popular, always eager to help.");
		break;
		case "ISTP":
			System.out.println("The Virtuoso: Bold and practical experimenters, masters of all kinds of tools.");
		break;
		case "ISFP":
			System.out.println("The Adventurer: Flexible and charming artists, always ready to explore and experience.");
		break;
		case "ESTP":
			System.out.println("The Entrepreneur: Smart, energetic, and very perceptive people who love living on the edge.");
		break;
		case "ESFP":
			System.out.println("The Entertainer: Spontaneous, energetic, and enthusiastic, life is never boring around them.");
		break;
		default:
			System.out.println("Error: MBTI type not recognized.");

	}

	}

}