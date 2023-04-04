package org.bf2.GUI;

public class BF2GUI {
    
    public static void main(String[] args) {
        BF2Frame frame = new BF2Frame();
        
        int[][] hw = {
                    {0, 4, 8, 12, 16, 20, 24, 28},
                    {32, 36, 40, 44, 48, 52, 56, 60},
                    {64, 68, 72, 76, 80, 84, 88, 92},
                    {96, 100, 104, 108, 112, 116, 120, 124},
                    {128, 132, 136, 140, 144, 148, 152, 156},
                    {160, 164, 168, 172, 176, 180, 184, 188},
                    {192, 196, 200, 204, 208, 212, 216, 220},
                    {224, 228, 232, 236, 240, 244, 248, 252}
                };

        frame.print_as_int(hw);
        frame.pack();
        frame.setVisible(true);
    }
}