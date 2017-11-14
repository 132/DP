 

public class HomeTheaterTestDrive {
	public static void main(String[] args) {
		Amplifier amp = new Amplifier("Top-O-Line Amplifier");
		Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
		DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
		
		
		ICdPlayer cd1 = new CdPlayer("Top-O-Line CD Player", amp);
		
		
		CdPlayer_French cdFrench = new CdPlayer_French("tridpetrai", amp);
		ICdPlayer cd2 = new Adapter_CdPlayer(cdFrench);
		
		Projector projector = new Projector("Top-O-Line Projector", dvd);
		TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
		Screen screen = new Screen("Theater Screen");
		PopcornPopper popper = new PopcornPopper("Popcorn Popper");
 
		HomeTheaterFacade homeTheater = 
				new HomeTheaterFacade(amp, tuner, dvd, cd1, 
						projector, screen, lights, popper);
 
		homeTheater.watchMovie("Raiders of the Lost Ark");
		homeTheater.endMovie();
		// French version
		HomeTheaterFacade homeTheater_French = 
				new HomeTheaterFacade(amp, tuner, dvd, cd2,
						projector, screen, lights, popper);
		homeTheater_French.watchMovie("Tri Dep Trai");
		homeTheater_French.endMovie();
	}
}
