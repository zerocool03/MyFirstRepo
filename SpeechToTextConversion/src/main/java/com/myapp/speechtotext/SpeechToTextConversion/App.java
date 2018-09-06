package com.myapp.speechtotext.SpeechToTextConversion;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import com.google.cloud.speech.v1.RecognitionAudio;
import com.google.cloud.speech.v1.RecognitionConfig;
import com.google.cloud.speech.v1.RecognitionConfig.AudioEncoding;
import com.google.cloud.speech.v1.RecognitionConfig.Builder;
import com.google.cloud.speech.v1.RecognizeResponse;
import com.google.cloud.speech.v1.SpeechClient;
import com.google.cloud.speech.v1.SpeechRecognitionAlternative;
import com.google.cloud.speech.v1.SpeechRecognitionResult;
import com.google.protobuf.ByteString;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {

		// Instantiates a client
		try (SpeechClient speechClient = SpeechClient.create()) {
			System.out.println(
					"Use the following <Audio file path> FLAC|LINEAR16|AMR|MULAW|UNRECOGNIZED en-Us|en-Uk");
			// The path to the audio file to transcribe
			String fileName = args[0];

			// Reads the audio file into memory
			Path path = Paths.get(fileName);
			byte[] data = Files.readAllBytes(path);
			ByteString audioBytes = ByteString.copyFrom(data);
			String encoding = args[1];
			AudioEncoding audioEncoding;

			audioEncoding = getAudioEncoding(encoding);

			String langCode = args[2];
			// Builds the sync recognize request
			Builder builder = RecognitionConfig.newBuilder().setEncoding(audioEncoding);

			RecognitionConfig config = builder.setSampleRateHertz(getSampleRate(encoding)).setLanguageCode(langCode)
					.build();
			RecognitionAudio audio = RecognitionAudio.newBuilder().setContent(audioBytes).build();

			// Performs speech recognition on the audio file
			RecognizeResponse response = speechClient.recognize(config, audio);
			List<SpeechRecognitionResult> results = response.getResultsList();

			for (SpeechRecognitionResult result : results) {
				// There can be several alternative transcripts for a given chunk of speech.
				// Just use the
				// first (most likely) one here.
				SpeechRecognitionAlternative alternative = result.getAlternativesList().get(0);
				System.out.printf("Transcription: %s%n", alternative.getTranscript());
			}
		}
	}

	private static int getSampleRate(String encoding) {
		// TODO Auto-generated method stub
		if (encoding.equals("AMR"))

			return 8000;

		if (encoding.equals("FLAC"))
			return 16000;
		if (encoding.equals("LINEAR16"))
			return 16000;
		if (encoding.equals("MULAW"))
			return 16000;
		if (encoding.equals("UNRECOGNIZED"))
			return 16000;

		return 0;
	}

	private static AudioEncoding getAudioEncoding(String encoding) {
		if (encoding.equals("AMR"))

			return AudioEncoding.AMR;

		if (encoding.equals("FLAC"))
			return AudioEncoding.FLAC;
		if (encoding.equals("LINEAR16"))
			return AudioEncoding.LINEAR16;
		if (encoding.equals("MULAW"))
			return AudioEncoding.MULAW;
		if (encoding.equals("UNRECOGNIZED"))
			return AudioEncoding.UNRECOGNIZED;

		return null;
		// TODO Auto-generated method stub

	}

}
