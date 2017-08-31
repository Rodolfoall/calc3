package com.example.android.calc3;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.speech.RecognizerIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private final int REQ_CODE_SPEECH_OUTPIT = 143;

    private double operador1;
    private double operador2;
    private double operadores;

    boolean mAdicao, mSubtracao, mMultiplicacao, mDivisao, mPotencia, mRaiz, mPorcento;

    private EditText txt_visor;


    private Button n1;
    private Button n2;
    private Button n3;
    private Button n4;
    private Button n5;
    private Button n6;
    private Button n7;
    private Button n8;
    private Button n9;
    private Button n0;
    private Button dois_zeros;

    private Button ponto;

    public Button soma;
    private Button subitracao;
    private Button multiplicacao;
    private Button divisao;
    private Button porcento;
    private Button potenciacao;
    private Button raiz;

    private Button igual;

    private Button limpar;
    private Button btn_falar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        txt_visor = (EditText) findViewById(R.id.txt_visor);

        n1 = (Button) findViewById(R.id.n1);
        n2 = (Button) findViewById(R.id.n2);
        n3 = (Button) findViewById(R.id.n3);
        n4 = (Button) findViewById(R.id.n4);
        n5 = (Button) findViewById(R.id.n5);
        n6 = (Button) findViewById(R.id.n6);
        n7 = (Button) findViewById(R.id.n7);
        n8 = (Button) findViewById(R.id.n8);
        n9 = (Button) findViewById(R.id.n9);
        n0 = (Button) findViewById(R.id.n0);
        dois_zeros = (Button) findViewById(R.id.dois_zeros);


        ponto = (Button) findViewById(R.id.ponto);

        soma = (Button) findViewById(R.id.soma);
        subitracao = (Button) findViewById(R.id.subitracao);
        multiplicacao = (Button) findViewById(R.id.multiplicacao);
        divisao = (Button) findViewById(R.id.divisao);
        porcento = (Button) findViewById(R.id.porcento);
        potenciacao = (Button) findViewById(R.id.potenciacao);
        raiz = (Button) findViewById(R.id.raiz);


        igual = (Button) findViewById(R.id.igual);

        limpar = (Button) findViewById(R.id.limpar);
        btn_falar = (Button) findViewById(R.id.btn_falar);


        btn_falar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirMic();
            }
        });



        /* setando o número de cada botão*/


        n1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                txt_visor.setText(txt_visor.getText() + "1");

            }
        });


        n2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                txt_visor.setText(txt_visor.getText() + "2");
            }
        });

        n3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                txt_visor.setText(txt_visor.getText() + "3");
            }
        });

        n4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                txt_visor.setText(txt_visor.getText() + "4");
            }
        });

        n5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                txt_visor.setText(txt_visor.getText() + "5");
            }
        });

        n6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                txt_visor.setText(txt_visor.getText() + "6");
            }
        });

        n7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                txt_visor.setText(txt_visor.getText() + "7");
            }
        });

        n8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                txt_visor.setText(txt_visor.getText() + "8");
            }
        });

        n9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                txt_visor.setText(txt_visor.getText() + "9");
            }
        });

        n0.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                txt_visor.setText(txt_visor.getText() + "0");
            }
        });

        dois_zeros.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                txt_visor.setText(txt_visor.getText() + "00");
            }
        });

        soma.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                {
                    operador1 = Double.parseDouble(txt_visor.getText() + "");
                    mAdicao = true;
                    txt_visor.setText(null);


                }
            }

        });


        subitracao.setOnClickListener(new View.OnClickListener()

                                      {

                                          @Override
                                          public void onClick(View v) {


                                              operador1 = Double.parseDouble(txt_visor.getText() + "");
                                              mSubtracao = true;
                                              txt_visor.setText(null);


                                          }
                                      }

        );

        multiplicacao.setOnClickListener(new View.OnClickListener()

                                         {

                                             @Override
                                             public void onClick(View v) {

                                                 operador1 = Double.parseDouble(txt_visor.getText() + "");
                                                 mMultiplicacao = true;
                                                 txt_visor.setText(null);


                                             }
                                         }

        );

        divisao.setOnClickListener(new View.OnClickListener()

                                   {

                                       @Override
                                       public void onClick(View v) {


                                           operador1 = Double.parseDouble(txt_visor.getText() + "");
                                           mDivisao = true;
                                           txt_visor.setText(null);


                                       }
                                   }


        );
        potenciacao.setOnClickListener(new View.OnClickListener()

                                       {

                                           @Override
                                           public void onClick(View v) {


                                               operador1 = Double.parseDouble(txt_visor.getText() + "");
                                               mPotencia = true;
                                               txt_visor.setText(null);


                                           }
                                       }


        );
        raiz.setOnClickListener(new View.OnClickListener()

                                {

                                    @Override
                                    public void onClick(View v) {


                                        operador1 = Double.parseDouble(txt_visor.getText() + "");
                                        mRaiz = true;
                                        txt_visor.setText(null);
                                        operadores = Math.sqrt(operador1);
                                        txt_visor.setText(operadores + "");


                                    }
                                }


        );

        porcento.setOnClickListener(new View.OnClickListener()

                                    {

                                        @Override
                                        public void onClick(View v) {


                                            operador1 = Double.parseDouble(txt_visor.getText() + "");
                                            mPorcento = true;
                                            txt_visor.setText(null);


                                        }
                                    }


        );


        igual.setOnClickListener(new View.OnClickListener()

                                 {

                                     @Override
                                     public void onClick(View v) {

                                         operador2 = Double.parseDouble(txt_visor.getText().toString() + "");

                                         if (mAdicao == true) {


                                             txt_visor.setText(operador1 + operador2 + "");
                                             mAdicao = false;

                                         }
                                         if (mSubtracao == true) {

                                             txt_visor.setText(operador1 - operador2 + "");
                                             mSubtracao = false;

                                         }
                                         if (mMultiplicacao == true) {
                                             txt_visor.setText(operador1 * operador2 + "");
                                             mMultiplicacao = false;
                                         }
                                         if (mDivisao == true) {

                                             txt_visor.setText(operador1 / operador2 + "");
                                             mDivisao = false;


                                         }
                                         if (mPotencia == true) {

                                             operadores = Math.pow(operador1, operador2);

                                             txt_visor.setText(operadores + "");
                                             mPotencia = false;


                                         }

                                         if (mPorcento == true) {

                                             operadores = (operador1 * operador2) / 100;
                                             txt_visor.setText(operadores + "");
                                             mPorcento = false;


                                         }


                                     }


                                 }

        );
        limpar.setOnClickListener(new View.OnClickListener()

                                  {

                                      @Override
                                      public void onClick(View v) {


                                          txt_visor.setText("");


                                      }

                                  }


        );

        ponto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt_visor.setText(txt_visor.getText() + ".");

            }
        });

    }

    private void abrirMic() {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);

        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Fale Agora");


        try {
            startActivityForResult(intent, REQ_CODE_SPEECH_OUTPIT);
        } catch (ActivityNotFoundException tim) {

        }


    }

    @Override

    /*onActivityResult é o retorno da chamada do startActivityForResults*/
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {

            /*verifica se o código corresponde ao que foi passado e garante
             * que o resultado seja OK e não um erro */

            case REQ_CODE_SPEECH_OUTPIT: {
                if (resultCode == RESULT_OK && null != data) {

            /*retira os resultados da intenção e configura no ArrayList*/

                    ArrayList<String> voiceText = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);


                    String string = voiceText.get(0).toString();

                    if (string.equals("soma")) {

                        operador1 = Double.parseDouble(txt_visor.getText() + "");
                        mAdicao = true;
                        txt_visor.setText(null);

                    } else if (string.equals("menos")) {
                        operador1 = Double.parseDouble(txt_visor.getText() + "");
                        mSubtracao = true;
                        txt_visor.setText(null);


                    }else if(string.equals("dividido")){

                        operador1 = Double.parseDouble(txt_visor.getText() + "");
                        mDivisao = true;
                        txt_visor.setText(null);



                    }else if (string.equals("vezes")){
                        operador1 = Double.parseDouble(txt_visor.getText() + "");
                        mMultiplicacao = true;
                        txt_visor.setText(null);


                    }else if (string.equals("igual")) {
                        operador2 = Double.parseDouble(txt_visor.getText().toString() + "");

                        if (mAdicao == true) {


                            txt_visor.setText(operador1 + operador2 + "");
                            mAdicao = false;

                        }
                        if (mSubtracao == true) {

                            txt_visor.setText(operador1 - operador2 + "");
                            mSubtracao = false;

                        }
                        if (mMultiplicacao == true) {
                            txt_visor.setText(operador1 * operador2 + "");
                            mMultiplicacao = false;
                        }
                        if (mDivisao == true) {

                            txt_visor.setText(operador1 / operador2 + "");
                            mDivisao = false;


                        }
                        if (mPotencia == true) {

                            operadores = Math.pow(operador1, operador2);

                            txt_visor.setText(operadores + "");
                            mPotencia = false;


                        }

                        if (mPorcento == true) {

                            operadores = (operador1 * operador2) / 100;
                            txt_visor.setText(operadores + "");
                            mPorcento = false;


                        }


                    } else {

                    }


                }
                break;

            }

        }
    }
}
