package com.iteso.decorator.ides;
import com.iteso.decorator.JavaIDE;
/**
 * Created by to_r_ on 4/15/2016.
 */
public class CodeBlocksIde extends JavaIDE{
    public String description = "CodeBlocks IDE ";
    @Override
    public String start() {
        return "CodeBlocks IDE started";
    }
}
