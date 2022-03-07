import java.io.File;

import javax.sound.sampled.AudioSystem;

import it.sauronsoftware.jave.AudioAttributes;
import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.EncodingAttributes;

public class Main {
		
	public static void main(String[] s)
	{
		File source = new File("C:/Users/msingh/Downloads/fam.mp4");
		File target = new File("C:/Users/msingh/Downloads/fam2.wav");
		
		AudioAttributes audioAttributes = new AudioAttributes();
		//audioAttributes.setCodec("wav");
		audioAttributes.setBitRate(64000);
		audioAttributes.setChannels(2);
		audioAttributes.setSamplingRate(8000);
		
		EncodingAttributes encodingAttributes = new EncodingAttributes();
		encodingAttributes.setFormat("wav");
		encodingAttributes.setAudioAttributes(audioAttributes);
		
		try {
			Encoder encoder = new Encoder();
			encoder.encode(source, target, encodingAttributes);
			System.out.println(" :: file is converted :: ");
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
}
