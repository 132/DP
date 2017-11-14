package facadehometheater;

import java.util.LinkedList;
import java.util.Queue;

public class HomeTheaterFacade
{
    
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    Queue<String> recentMovies;

    public HomeTheaterFacade(
        Amplifier amp,
        Tuner tuner,
        DvdPlayer dvd,
        CdPlayer cd,
        Projector projector,
        Screen screen,
        TheaterLights lights,
        PopcornPopper popper
    )
    {
        
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.popper = popper;

        recentMovies = new LinkedList<String>();
    }

    public void watchMovie(String movie)
    {
        
        if (recentMovies.contains(movie))
        {
            System.out.println("You've already seen this movie recently.");
            return;
        }

        if (recentMovies.size() == 5)
        {
            recentMovies.poll();
        }
        recentMovies.add(movie);

        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie()
    {
        
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }

    public void listenToCd(String cdTitle)
    {
        
        System.out.println("Get ready for an audiopile experence...");
        lights.on();
        amp.on();
        amp.setVolume(5);
        amp.setCd(cd);
        amp.setStereoSound();
        cd.allumé();
        cd.lire(cdTitle);
    }

    public void endCd()
    {
        
        System.out.println("Shutting down CD...");
        amp.off();
        amp.setCd(cd);
        cd.éjecte();
        cd.coupé();
    }

    public void listenToRadio(double frequency)
    {
        
        System.out.println("Tuning in the airwaves...");
        tuner.on();
        tuner.setFrequency(frequency);
        amp.on();
        amp.setVolume(5);
        amp.setTuner(tuner);
    }

    public void endRadio()
    {
        
        System.out.println("Shutting down the tuner...");
        tuner.off();
        amp.off();
    }
}