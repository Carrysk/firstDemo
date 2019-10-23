package com.carrysk.Demo05File.demo03Filter;

import java.io.File;
import java.io.FileFilter;

public class FileFilterImp implements FileFilter {
    @Override
    public boolean accept(File file) {

        // 如果是文件 则继续遍历
        if (file.isDirectory()) {
            return true;
        }
        return file.getName().toLowerCase().endsWith(".java");
    }
}
