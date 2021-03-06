package com.wh.jvm.instruction.load;

import com.wh.jvm.instruction.Instruction;
import com.wh.jvm.rtda.StackFrame;

public class LoadFloat3 extends Instruction {

    @Override
    public void execute(StackFrame frame) {
        float value = frame.mLocalVarsTable.getFloat(3);
        frame.mOpStack.pushFloat(value);
    }
}
