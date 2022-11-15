package com.javafee.java.lessons.lesson10.backend;

public class ObliczCzas {
    public static int[] KalkuratorCzasu(String wprowadzdate, String datawyjscia, String wprowadzgodzine, String czaswyjscia) {
        int pierwszyDzien = Integer.parseInt(wprowadzdate.substring(8, 10));
        int ostatniDzien = Integer.parseInt(datawyjscia.substring(8, 10));
        int pierweszyMiesiac = Integer.parseInt(wprowadzdate.substring(5, 7), 10);
        int ostatniMiesiac = Integer.parseInt(datawyjscia.substring(5, 7));
        int pierwszyRok = Integer.parseInt(wprowadzdate.substring(0, 4));
        //obliczanie czasu dla roznych dni miesiaca}
        if (pierweszyMiesiac != ostatniMiesiac) {
            int dniWMiesiacu;
            if (pierweszyMiesiac == 1 || pierweszyMiesiac == 3 || pierweszyMiesiac == 5 || pierweszyMiesiac == 7 || pierweszyMiesiac == 8 || pierweszyMiesiac == 10 || pierweszyMiesiac == 12) {
                dniWMiesiacu = 31;
            } else {
                if (pierweszyMiesiac == 2) {
                    dniWMiesiacu = (pierwszyRok % 4 == 0) ? 29 : 28;
                } else {
                    dniWMiesiacu = 30;
                }
            }
            //Calkowita godzina w 1 dniu.
            int Dzien = dniWMiesiacu - pierwszyDzien;
            Dzien = Dzien + (ostatniDzien - 1);
            int GodzinaCalkowitaDni = Dzien * 24;

            //Calkowita godzina w 1 dniu
            int GodzinyPierwszegoDnia = 0;
            int MinutyPierwszegoDnia = 0;


            if (wprowadzgodzine.substring(6, 8).equals("AM")) {
                if (Integer.parseInt(wprowadzgodzine.substring(0, 2)) == 12) {
                    GodzinyPierwszegoDnia = 11 + 12;
                    MinutyPierwszegoDnia = 60 - Integer.parseInt(wprowadzgodzine.substring(3, 5));
                } else {
                    GodzinyPierwszegoDnia = (12 - (Integer.parseInt(wprowadzgodzine.substring(0, 2)) + 1)) + 12;
                    MinutyPierwszegoDnia = 60 - Integer.parseInt(wprowadzgodzine.substring(3, 5));
                }
            } else if (wprowadzgodzine.substring(6, 8).equals("PM")) {
                if (Integer.parseInt(wprowadzgodzine.substring(0, 2)) == 12) {
                    GodzinyPierwszegoDnia = 11;
                    MinutyPierwszegoDnia = 60 - Integer.parseInt(wprowadzgodzine.substring(3, 5));
                } else {
                    GodzinyPierwszegoDnia = 12 - (Integer.parseInt(wprowadzgodzine.substring(0, 2)) + 1);
                    MinutyPierwszegoDnia = 60 - Integer.parseInt(wprowadzgodzine.substring(3, 5));
                }
            }
            //Calkowita godzina i minuta ostatniego dnia.
            int GodzinyOstatniegoDnia = 0;
            int MinutyOstatniegoDnia = 0;

            if (czaswyjscia.substring(6, 8).equals("AM")) {
                if (Integer.parseInt(czaswyjscia.substring(0, 2)) == 12) {
                    GodzinyOstatniegoDnia = 0;
                    MinutyOstatniegoDnia = Integer.parseInt(czaswyjscia.substring(3, 5));
                } else {
                    GodzinyOstatniegoDnia = Integer.parseInt(czaswyjscia.substring(0, 2));
                    MinutyOstatniegoDnia = Integer.parseInt(czaswyjscia.substring(3, 5));
                }
            } else if (czaswyjscia.substring(6, 8).equals("PM")) {
                if (Integer.parseInt(czaswyjscia.substring(0, 2)) == 12) {
                    GodzinyOstatniegoDnia = 12;
                    MinutyOstatniegoDnia = Integer.parseInt(czaswyjscia.substring(3, 5));
                } else {
                    GodzinyOstatniegoDnia = 12 + Integer.parseInt(czaswyjscia.substring(0, 2));
                    MinutyOstatniegoDnia = Integer.parseInt(czaswyjscia.substring(3, 5));
                }
                //Suma godzin i minut
                int godzina = GodzinaCalkowitaDni + GodzinyPierwszegoDnia + GodzinyOstatniegoDnia;
                int minuta = MinutyPierwszegoDnia + MinutyOstatniegoDnia;
                if (minuta >= 60) {
                    minuta = minuta - 60;
                    godzina = godzina + 1;
                }
                return new int[]{godzina, minuta};
            }
        }
        //Obliczanie czasu dla dni tego samego miesiaca
        else {
            if ((ostatniDzien - pierwszyDzien) >= 2) {
                // Całkowita godzina w dniach
                int Dzien = (ostatniDzien - (pierwszyDzien - 1)) - 2;
                int GodzinaCalkowitaDni = Dzien * 24;

                // Całkowita godzina w 1. dniu
                int GodzinyPierwszegoDnia = 0;
                int MinutyPierwszegoDnia = 0;

                if (wprowadzgodzine.substring(6, 8).equals("AM")) {
                    if (Integer.parseInt(wprowadzgodzine.substring(0, 2)) == 12) {
                        GodzinyPierwszegoDnia = 11 + 12;
                        MinutyPierwszegoDnia = 60 - Integer.parseInt(wprowadzgodzine.substring(3, 5));
                    } else {
                        GodzinyPierwszegoDnia = (12 - (Integer.parseInt(wprowadzgodzine.substring(0, 2)) + 1)) + 12;
                        MinutyPierwszegoDnia = 60 - Integer.parseInt(wprowadzgodzine.substring(3, 5));
                    }
                } else if (wprowadzgodzine.substring(6, 8).equals("PM")) {
                    if (Integer.parseInt(wprowadzgodzine.substring(0, 2)) == 12) {
                        GodzinyPierwszegoDnia = 11;
                        MinutyPierwszegoDnia = 60 - Integer.parseInt(wprowadzgodzine.substring(3, 5));
                    } else {
                        GodzinyPierwszegoDnia = 12 - (Integer.parseInt(wprowadzgodzine.substring(0, 2)) + 1);
                        MinutyPierwszegoDnia = 60 - Integer.parseInt(wprowadzgodzine.substring(3, 5));
                    }
                }


                // Całkowita godzina i minuta ostatniego dnia
                int GodzinyOstatniegoDnia = 0;
                int MinutyOstatniegoDnia = 0;

                if (czaswyjscia.substring(6, 8).equals("AM")) {
                    if (Integer.parseInt(czaswyjscia.substring(0, 2)) == 12) {
                        GodzinyOstatniegoDnia = 0;
                        MinutyOstatniegoDnia = Integer.parseInt(czaswyjscia.substring(3, 5));
                    } else {
                        GodzinyOstatniegoDnia = Integer.parseInt(czaswyjscia.substring(0, 2));
                        MinutyOstatniegoDnia = Integer.parseInt(czaswyjscia.substring(3, 5));
                    }
                } else if (czaswyjscia.substring(6, 8).equals("PM")) {
                    if (Integer.parseInt(czaswyjscia.substring(0, 2)) == 12) {
                        GodzinyOstatniegoDnia = 12;
                        MinutyOstatniegoDnia = Integer.parseInt(czaswyjscia.substring(3, 5));
                    } else {
                        GodzinyOstatniegoDnia = 12 + Integer.parseInt(czaswyjscia.substring(0, 2));
                        MinutyOstatniegoDnia = Integer.parseInt(czaswyjscia.substring(3, 5));
                    }
                }

                // Suma godzin i minut

                int godzina = GodzinaCalkowitaDni + GodzinyPierwszegoDnia + GodzinyOstatniegoDnia;
                int minuta = MinutyPierwszegoDnia + MinutyOstatniegoDnia;

                if (minuta >= 60) {
                    minuta = minuta - 60;
                    godzina = godzina + 1;
                }

                return new int[]{godzina, minuta};
            }

            // tylko za jeden dzień różnicy

            else if ((ostatniDzien - pierwszyDzien) == 1) {
                int GodzinyPierwszegoDnia = 0;
                int MinutyPierwszegoDnia = 0;

                if (wprowadzgodzine.substring(6, 8).equals("AM")) {
                    if (Integer.parseInt(wprowadzgodzine.substring(0, 2)) == 12) {
                        GodzinyPierwszegoDnia = 11 + 12;
                        MinutyPierwszegoDnia = 60 - Integer.parseInt(wprowadzgodzine.substring(3, 5));
                    } else {
                        GodzinyPierwszegoDnia = (12 - (Integer.parseInt(wprowadzgodzine.substring(0, 2)) + 1)) + 12;
                        MinutyPierwszegoDnia = 60 - Integer.parseInt(wprowadzgodzine.substring(3, 5));
                    }
                } else if (wprowadzgodzine.substring(6, 8).equals("PM")) {
                    if (Integer.parseInt(wprowadzgodzine.substring(0, 2)) == 12) {
                        GodzinyPierwszegoDnia = 11;
                        MinutyPierwszegoDnia = 60 - Integer.parseInt(wprowadzgodzine.substring(3, 5));
                    } else {
                        GodzinyPierwszegoDnia = 12 - (Integer.parseInt(wprowadzgodzine.substring(0, 2)) + 1);
                        MinutyPierwszegoDnia = 60 - Integer.parseInt(wprowadzgodzine.substring(3, 5));
                    }

                }

                // godzina i minuta w pierwszym i ostatnim dniu
                int GodzinyOstatniegoDnia = 0;
                int MinutyOstatniegoDnia = 0;

                if (czaswyjscia.substring(6, 8).equals("AM")) {
                    if (Integer.parseInt(czaswyjscia.substring(0, 2)) == 12) {
                        GodzinyOstatniegoDnia = 0;
                        MinutyOstatniegoDnia = Integer.parseInt(czaswyjscia.substring(3, 5));
                    } else {
                        GodzinyOstatniegoDnia = Integer.parseInt(czaswyjscia.substring(0, 2));
                        MinutyOstatniegoDnia = Integer.parseInt(czaswyjscia.substring(3, 5));
                    }

                } else if (czaswyjscia.substring(6, 8).equals("PM")) {
                    if (Integer.parseInt(czaswyjscia.substring(0, 2)) == 12) {
                        GodzinyOstatniegoDnia = 12;
                        MinutyOstatniegoDnia = Integer.parseInt(czaswyjscia.substring(3, 5));
                    } else {
                        GodzinyOstatniegoDnia = 12 + Integer.parseInt(czaswyjscia.substring(0, 2));
                        MinutyOstatniegoDnia = Integer.parseInt(czaswyjscia.substring(3, 5));
                    }

                }
                int godzina = GodzinyPierwszegoDnia + GodzinyOstatniegoDnia;
                int minuta = MinutyPierwszegoDnia + MinutyOstatniegoDnia;
                if (minuta >= 60) {
                    minuta = minuta - 60;
                    godzina = godzina + 1;
                }
                return new int[]{godzina, minuta};

            }

            //na jeden dzień


            else if ((ostatniDzien - pierwszyDzien) == 0) {
                int Godzinaparkowania = 0;
                int Minutaparkowania = 0;
                int Godzinawyjscia = 0;
                int Minutawyjscia = 0;
                int godzina = 0;
                int minuta = 0;

                if (wprowadzgodzine.substring(6, 8).equals("AM") && czaswyjscia.substring(6, 8).equals("AM")) {
                    if (Integer.parseInt(wprowadzgodzine.substring(0, 2)) == 12) {
                        godzina = Integer.parseInt(czaswyjscia.substring(0, 2));
                        minuta = (60 - Integer.parseInt(wprowadzgodzine.substring(3, 5))) + Integer.parseInt(czaswyjscia.substring(3, 5));
                    } else {
                        godzina = Integer.parseInt(czaswyjscia.substring(0, 2)) - (Integer.parseInt(wprowadzgodzine.substring(0, 2)) + 1);
                        minuta = (60 - Integer.parseInt(wprowadzgodzine.substring(3, 5))) + Integer.parseInt(czaswyjscia.substring(3, 5));
                    }
                } else if (wprowadzgodzine.substring(6, 8).equals("PM") && czaswyjscia.substring(6, 8).equals("PM")) {

                    if (Integer.parseInt(wprowadzgodzine.substring(0, 2)) == 12) {
                        godzina = Integer.parseInt(czaswyjscia.substring(0, 2));
                        minuta = (60 - Integer.parseInt(wprowadzgodzine.substring(3, 5))) + Integer.parseInt(czaswyjscia.substring(3, 5));
                    } else {
                        godzina = Integer.parseInt(czaswyjscia.substring(0, 2)) - (Integer.parseInt(wprowadzgodzine.substring(0, 2)) + 1);
                        minuta = (60 - Integer.parseInt(wprowadzgodzine.substring(3, 5))) + Integer.parseInt(czaswyjscia.substring(3, 5));
                    }

                } else if (wprowadzgodzine.substring(6, 8).equals("AM") && czaswyjscia.substring(6, 8).equals("PM")) {

                    if (Integer.parseInt(wprowadzgodzine.substring(0, 2)) == 12) {
                        Godzinaparkowania = 12;
                        Minutaparkowania = 60 - Integer.parseInt(wprowadzgodzine.substring(3, 5));
                    } else {
                        Godzinaparkowania = 12 - (Integer.parseInt(wprowadzgodzine.substring(0, 2)) + 1);
                        Minutaparkowania = 60 - Integer.parseInt(wprowadzgodzine.substring(3, 5));
                    }

                    if (Integer.parseInt(czaswyjscia.substring(0, 2)) == 12) {
                        Godzinawyjscia = 0;
                        Minutawyjscia = Integer.parseInt(czaswyjscia.substring(3, 5));
                    } else {
                        Godzinawyjscia = Integer.parseInt(czaswyjscia.substring(0, 2));
                        Minutawyjscia = Integer.parseInt(czaswyjscia.substring(3, 5));
                    }
                    godzina = Godzinaparkowania + Godzinawyjscia;
                    minuta = Minutaparkowania + Minutawyjscia;

                }

                if (minuta >= 60) {
                    minuta = minuta - 60;
                    godzina = godzina + 1;
                }

                return new int[]{godzina, minuta};
            }
        }
        return new int[]{};
    }
}