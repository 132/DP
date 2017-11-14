
package facadehometheater;

public class CdPlayer
{

    String description;
    int currentTrack;
    Amplifier amplifier;
    String title;

    public CdPlayer(String description, Amplifier amplifier)
    {
        this.description = description;
        this.amplifier = amplifier;
    }

    public void allumé() // on()
    {
        System.out.println(description + " allumé");
    }

    public void coupé() // off()
    {
        System.out.println(description + " coupé");
    }

    public void éjecte() // eject()
    {
        title = null;
        System.out.println(description + " éjecte");
    }

    public void lire(String title) // play()
    {
        this.title = title;
        currentTrack = 0;
        System.out.println(description + " en reproduction: \"" + title + "\"");
    }

    public void lire(int track) // play()
    {
        if (title == null)
        {
            System.out.println(description + " ne peuvent pas lire la piste " + currentTrack
                    + ", aucun cd inséré");
        }
        else
        {
            currentTrack = track;
            System.out.println(description + " track " + currentTrack + "en reproduction");
        }
    }

    public void arrête() // stop()
    {
        currentTrack = 0;
        System.out.println(description + " arrêté");
    }

    public void pause() // pause()
    {
        System.out.println(description + "\"" + title + "\" en pause");
    }

    public String toString()
    {
        return description;
    }
}
