package com.wh.jvm.classfile.attributeinfo;

import com.wh.jvm.classfile.basictype.U2;
import com.wh.jvm.classfile.basictype.U4;
import com.wh.jvm.classfile.constantpool.ConstantPool;
import com.wh.jvm.classfile.constantpool.ConstantUtf8Info;

import java.io.InputStream;

/**
 * Created by chenyangli.
 */
public class SourceFile extends BasicAttributeInfo {

    private short sourceFileIndex;

    public SourceFile(ConstantPool constantPool, short attributeNameIndex) {
        super(constantPool);
        setAttributeNameIndex(attributeNameIndex);
    }

    @Override
    public void read(InputStream inputStream) {
        U4 attributeLengthU4 = U4.read(inputStream);
        U2 sourceFileIndexU2 = U2.read(inputStream);
        setAttributeLength(attributeLengthU4.getValue());
        sourceFileIndex = sourceFileIndexU2.getValue();
    }

    @Override
    public String toString() {
        return "SourceFile{" +
                "attributeNameIndex=" + getAttributeNameIndex() +
                " [attribute name = " + ((ConstantUtf8Info) (constantPool.getCpInfo()[getAttributeNameIndex() - 1])).getValue() + "]" +
                ", attributeLength=" + getAttributeLength() +
                ", sourceFileIndex=" + sourceFileIndex +
                '}';
    }

}
