package ru.ikonnikov;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CiskoRouter {

    private static List<Interface> interfacesList = new ArrayList<>();

    private static String selectionOfDescription(String string) {
        String[] strMas = string.split(":");
        return strMas[1].trim();
    }

    private static Interface interfaceSelection(String string) {
        String[] strMas = string.split("=");
        String[] strMas2 = strMas[0].split("\\.");
        String strIndex = (strMas2[(strMas2.length) - 1].trim());
        Interface selectedInterface = new Interface();
        if (!strIndex.equals("0"))
            for (Interface i : interfacesList
                    ) {
                if (strIndex.equals(i.getIndex()))
                    selectedInterface = i;
            }
        return selectedInterface;
    }

    public static void main(String[] args) {

        String readableStr;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/cisco_router.txt"))) {

            while (bufferedReader.ready()) {

                readableStr = bufferedReader.readLine();

                //Knowing exactly what this set of numbers means(".1.3.6.1.2.1.2.2.1.1."),
                // and what these files consist of("src/cisco_router.txt"), I decided to simply use the "contains" method.

                if (readableStr.contains(".1.3.6.1.2.1.2.2.1.1.")) {
                    String[] strmas = readableStr.split("=");
                    String[] strmas2 = strmas[0].split("\\.");
                    String index = (strmas2[(strmas2.length) - 1].trim());
                    if (!index.equals("0")) interfacesList.add(new Interface(index));

                } else if (readableStr.contains(".1.3.6.1.2.1.2.2.1.2.")) {
                    interfaceSelection(readableStr).setDescription(selectionOfDescription(readableStr));

                } else if (readableStr.contains(".1.3.6.1.2.1.2.2.1.3.")) {
                    interfaceSelection(readableStr).setType(selectionOfDescription(readableStr));

                } else if (readableStr.contains(".1.3.6.1.2.1.2.2.1.4.")) {
                    interfaceSelection(readableStr).setMtu(selectionOfDescription(readableStr));

                } else if (readableStr.contains(".1.3.6.1.2.1.2.2.1.5.")) {
                    interfaceSelection(readableStr).setSpeed(selectionOfDescription(readableStr));

                } else if (readableStr.contains(".1.3.6.1.2.1.2.2.1.6.")) {
                    interfaceSelection(readableStr).setPhysAddress(selectionOfDescription(readableStr));

                } else if (readableStr.contains(".1.3.6.1.2.1.2.2.1.7.")) {
                    interfaceSelection(readableStr).setAdminStatus(selectionOfDescription(readableStr));

                } else if (readableStr.contains(".1.3.6.1.2.1.2.2.1.8.")) {
                    interfaceSelection(readableStr).setOperStatus(selectionOfDescription(readableStr));

                } else if (readableStr.contains(".1.3.6.1.2.1.2.2.1.9.")) {
                    interfaceSelection(readableStr).setLastChange(selectionOfDescription(readableStr));

                } else if (readableStr.contains(".1.3.6.1.2.1.2.2.1.10.")) {
                    interfaceSelection(readableStr).setInOctets(selectionOfDescription(readableStr));

                } else if (readableStr.contains(".1.3.6.1.2.1.2.2.1.11.")) {
                    interfaceSelection(readableStr).setInUcastPkts(selectionOfDescription(readableStr));

                } else if (readableStr.contains(".1.3.6.1.2.1.2.2.1.13.")) {
                    interfaceSelection(readableStr).setInDiscards(selectionOfDescription(readableStr));

                } else if (readableStr.contains(".1.3.6.1.2.1.2.2.1.14.")) {
                    interfaceSelection(readableStr).setInErrors(selectionOfDescription(readableStr));

                } else if (readableStr.contains(".1.3.6.1.2.1.2.2.1.15.")) {
                    interfaceSelection(readableStr).setInUnknownProtos(selectionOfDescription(readableStr));

                } else if (readableStr.contains(".1.3.6.1.2.1.2.2.1.16.")) {
                    interfaceSelection(readableStr).setOutOctets(selectionOfDescription(readableStr));

                } else if (readableStr.contains(".1.3.6.1.2.1.2.2.1.17.")) {
                    interfaceSelection(readableStr).setOutUcastPkts(selectionOfDescription(readableStr));

                } else if (readableStr.contains(".1.3.6.1.2.1.2.2.1.19.")) {
                    interfaceSelection(readableStr).setOutDiscards(selectionOfDescription(readableStr));

                } else if (readableStr.contains(".1.3.6.1.2.1.2.2.1.20.")) {
                    interfaceSelection(readableStr).setOutErrors(selectionOfDescription(readableStr));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        //Since there was no exact indication in the task, I also wrote "null"-fields to a file.

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/Interfaces.txt"))) {

            for (Interface element : interfacesList
                    ) {
                bufferedWriter.write(element.toString() + "\n" + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
