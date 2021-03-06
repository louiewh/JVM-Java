package com.wh.jvm.classfile.constantpool;

import com.wh.jvm.classfile.basictype.U4;

import java.io.InputStream;

/**
 * Created by chenyangli.
 */
public class ConstantIntegerInfo extends ConstantPoolInfo {

    private int bytesValue;

    public ConstantIntegerInfo(byte tag) {
        setTag(tag);
    }

    @Override
    public void read(InputStream inputStream) {
        U4 bytesValueU4 = U4.read(inputStream);
        this.bytesValue = bytesValueU4.getValue();
    }

    @Override
    public String toString() {
        return "ConstantIntegerInfo{" +
                "bytesValue=" + bytesValue +
                '}';
    }

    public int getBytesValue(){
        return bytesValue;
    }
}
