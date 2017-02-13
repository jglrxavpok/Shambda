import org.jglr.sbm.utils.ModuleGenerator;

public class HelloVulkanVertexShader {

    public static byte[] createVertexShader() {
        ModuleGenerator generator = new ModuleGenerator();

        return generator.toBytes();
    }
}
