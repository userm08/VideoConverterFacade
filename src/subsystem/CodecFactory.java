package subsystem;

public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: extracting MPEG audio...");
            return new OggCompressionCodec();
        } else {
            System.out.println("CodecFactory: extracting audio codec...");
            return new MPEG4CompressionCodec();
        }
    }
}