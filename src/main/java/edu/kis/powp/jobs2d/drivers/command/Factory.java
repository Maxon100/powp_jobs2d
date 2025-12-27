package edu.kis.powp.jobs2d.drivers.command;
import java.util.ArrayList;
import java.util.List;

public class Factory {
    public static DriverCommand RectangleCommand() {
        List<DriverCommand> commands = new ArrayList<>();

        commands.add(new SetPositionCommand(-80, -40));
        commands.add(new OperateToCommand(80, -40));
        commands.add(new OperateToCommand(80, 50));
        commands.add(new OperateToCommand(-80, 50));
        commands.add(new OperateToCommand(-80, -40));

        return new ComplexCommand(commands);
    }

    public static DriverCommand TriangleCommand() {
        List<DriverCommand> commands = new ArrayList<>();

        commands.add(new SetPositionCommand(-60, -40));
        commands.add(new OperateToCommand(40, -40));
        commands.add(new OperateToCommand(-60, 60));
        commands.add(new OperateToCommand(-60, -40));

        return new ComplexCommand(commands);
    }

}
