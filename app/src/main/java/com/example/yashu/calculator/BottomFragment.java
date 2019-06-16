package com.example.yashu.calculator;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class BottomFragment extends Fragment {

    private static String Question = new String("");
    private static String Answer = new String("");

    boolean numpermission = true;

    boolean minpermission = true;
    boolean plusepermission = false;
    boolean mulpermission = false;
    boolean divpermission = false;
    boolean modpermission = false;

    boolean delper = true;
    boolean cpermission = false;
    boolean anspermission = false;

    boolean changepermissionformsd = false;
    boolean Changepermissionformin = false;

    private Button btnone , btntwo , btnthree , btnfour , btnfive , btnsix , btnseven , btneight , btnnine , btnzero , btndelemeter , btnans , btnsum , btnsub , btnmul , btndiv , btnmod , btndelete , btnclear;


    public BottomFragment() {
        // Required empty public constructor
    }

    TopSectionListner activitycommander;

    public interface TopSectionListner{
        public void setViewText(String q , String a , boolean auth);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            activitycommander = (TopSectionListner) context;

        }catch(ClassCastException e){
            throw new ClassCastException(context.toString());
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_bottom, container, false);

        btnone = (Button) view.findViewById(R.id.btnOne);
        btnone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numpermission == true){
                    mulpermission = true;
                    cpermission = true;
                    modpermission = true;
                    divpermission = true;
                    plusepermission = true;
                    minpermission = true;
                    Changepermissionformin = false;
                    changepermissionformsd = false;
                    anspermission = true;
                    Question = Question + "1";
                }else{
                    numpermission=true;
                    Question = new String("1");
                    Answer = new String("");
                }
                operation();
                activitycommander.setViewText(Question, Answer , false);
            }
        });

        btntwo = (Button) view.findViewById(R.id.btnTwo);
        btntwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numpermission == true){
                    mulpermission = true;
                    divpermission = true;
                    modpermission = true;
                    plusepermission = true;
                    minpermission = true;
                    cpermission = true;
                    anspermission = true;
                    Changepermissionformin = false;
                    changepermissionformsd = false;
                    Question = Question + "2";
                }else{
                    numpermission=true;
                    Question = new String("2");
                    Answer = new String("");
                }
                operation();
                activitycommander.setViewText(Question, Answer , false);
            }
        });

        btnthree = (Button) view.findViewById(R.id.btnThree);
        btnthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numpermission == true){
                    mulpermission = true;
                    plusepermission = true;
                    modpermission = true;
                    minpermission = true;
                    divpermission = true;
                    anspermission = true;
                    cpermission = true;
                    Changepermissionformin = false;
                    changepermissionformsd = false;
                    Question = Question + "3";
                }else{
                    numpermission=true;
                    Question = new String("3");
                    Answer = new String("");
                }
                operation();
                activitycommander.setViewText(Question, Answer , false);
            }
        });

        btnfour = (Button) view.findViewById(R.id.btnFour);
        btnfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numpermission==true){
                    mulpermission = true;
                    plusepermission = true;
                    modpermission = true;
                    divpermission = true;
                    minpermission = true;
                    cpermission = true;
                    anspermission = true;
                    Changepermissionformin = false;
                    changepermissionformsd = false;
                    Question = Question + "4";
                }else{
                    numpermission=true;
                    Question = new String("4");
                    Answer = new String("");
                }
                operation();
                activitycommander.setViewText(Question, Answer , false);
            }
        });

        btnfive = (Button) view.findViewById(R.id.btnFive);
        btnfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numpermission==true){
                    mulpermission = true;
                    plusepermission = true;
                    modpermission = true;
                    divpermission = true;
                    minpermission = true;
                    cpermission = true;
                    Changepermissionformin = false;
                    changepermissionformsd = false;
                    anspermission = true;
                    Question = Question + "5";
                }else{
                    numpermission=true;
                    Question = new String("5");
                    Answer = new String("");
                }
                operation();
                activitycommander.setViewText(Question, Answer , false);
            }
        });

        btnsix = (Button) view.findViewById(R.id.btnSix);
        btnsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numpermission==true){
                    mulpermission = true;
                    plusepermission = true;
                    modpermission = true;
                    divpermission = true;
                    minpermission = true;
                    cpermission = true;
                    Changepermissionformin = false;
                    changepermissionformsd = false;
                    anspermission = true;
                    Question = Question + "6";
                }else{
                    numpermission=true;
                    Question = new String("6");
                    Answer = new String("");
                }
                operation();
                activitycommander.setViewText(Question, Answer , false);
            }
        });

        btnseven = (Button) view.findViewById(R.id.btnSeven);
        btnseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numpermission==true){
                    mulpermission = true;
                    plusepermission = true;
                    minpermission = true;
                    modpermission = true;
                    divpermission = true;
                    cpermission = true;
                    anspermission = true;
                    Changepermissionformin = false;
                    changepermissionformsd = false;
                    Question = Question + "7";
                }else{
                    numpermission=true;
                    Question = new String("7");
                    Answer = new String("");
                }
                operation();
                activitycommander.setViewText(Question, Answer , false);
            }
        });

        btneight = (Button) view.findViewById(R.id.btnEight);
        btneight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numpermission==true){
                    mulpermission = true;
                    plusepermission = true;
                    minpermission = true;
                    modpermission = true;
                    divpermission = true;
                    cpermission = true;
                    anspermission = true;
                    Changepermissionformin = false;
                    changepermissionformsd = false;
                    Question = Question + "8";
                }else{
                    numpermission=true;
                    Question = new String("8");
                    Answer = new String("");
                }
                operation();
                activitycommander.setViewText(Question, Answer , false);
            }
        });

        btnnine = (Button) view.findViewById(R.id.btnNine);
        btnnine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numpermission==true){
                    mulpermission = true;
                    plusepermission = true;
                    divpermission = true;
                    minpermission = true;
                    modpermission = true;
                    cpermission = true;
                    anspermission = true;
                    Changepermissionformin = false;
                    changepermissionformsd = false;
                    Question = Question + "9";
                }else{
                    numpermission=true;
                    Question = new String("9");
                    Answer = new String("");
                }
                operation();
                activitycommander.setViewText(Question, Answer , false);
            }
        });

        btnzero = (Button) view.findViewById(R.id.btnZero);
        btnzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numpermission==true){
                    mulpermission = true;
                    cpermission = true;
                    modpermission = true;
                    divpermission = true;
                    plusepermission = true;
                    minpermission = true;
                    anspermission = true;
                    Changepermissionformin = false;
                    changepermissionformsd = false;
                    Question = Question + "0";
                }else{
                    numpermission=true;
                    Question = new String("0");
                    Answer = new String("");
                }
                operation();
                activitycommander.setViewText(Question, Answer , false);
            }
        });

        btndelemeter = (Button) view.findViewById(R.id.btnDelemeter);
        btndelemeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numpermission==true){
                    if (delper == true) {
                        mulpermission = true;
                        plusepermission = true;
                        divpermission = true;
                        minpermission = true;
                        modpermission = true;
                        anspermission = true;
                        cpermission = true;
                        delper = false;
                        Changepermissionformin = false;
                        changepermissionformsd = false;
                        Question = Question + ".";
                    }
                }else{
                    numpermission=true;
                    Question = new String(".");
                    Answer = new String("");
                }
                operation();
                activitycommander.setViewText(Question, Answer , false);
            }
        });

        btnans = (Button) view.findViewById(R.id.btnAns);
        btnans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (anspermission == true) {
                    anspermission = false;
                    changepermissionformsd = false;
                    Changepermissionformin = false;
                    if (cheackdel()) {
                        delper = false;
                    } else {
                        delper = true;
                    }

                    plusepermission = true;
                    minpermission = true;
                    divpermission = true;
                    modpermission = true;
                    mulpermission = true;
                    cpermission = true;
                    numpermission=false;
                    operation();
                    Question = new String(Answer);
                    activitycommander.setViewText(Question, Answer , false);
                }
            }
        });

        btnclear = (Button) view.findViewById(R.id.btnClear);
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Question = new String("");
                Answer = new String("");

                Answer = new String("");
                Question = new String("");

                minpermission = true;
                plusepermission = false;
                mulpermission = false;
                divpermission = false;
                modpermission = false;

                delper = true;
                cpermission = false;
                anspermission = false;
                numpermission=true;

                changepermissionformsd = false;
                Changepermissionformin = false;

                activitycommander.setViewText(Question, Answer , true);
            }
        });

        btndelete = (Button) view.findViewById(R.id.btnDelete);
        btndelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cpermission == true) {

                    Question = Question.substring(0, Question.length() - 1);

                    if (Question.length() == 0) {
                        cpermission = false;
                        mulpermission = false;
                        divpermission = false;
                        plusepermission = false;
                        minpermission = true;
                        modpermission = false;
                        delper = true;
                        anspermission = false;

                        Question = new String("");
                        Answer = new String("");

                        activitycommander.setViewText(Question, Answer , false);

                    } else if (Question.charAt(Question.length() - 1) == '*' || Question.charAt(Question.length() - 1) == '/' || Question.charAt(Question.length() - 1) == '%' || Question.charAt(Question.length() - 1) == '+' || Question.charAt(Question.length() - 1) == '-') {
                        divpermission = false;
                        modpermission = false;
                        anspermission=false;
                        mulpermission = false;
                        minpermission = false;
                        plusepermission = false;
                        delper = true;
                        operation();
                        activitycommander.setViewText(Question, Answer , false);
                    } else {

                        if(cheackdel1()==true){
                            delper=false;
                        }else{
                            delper=true;
                        }
                        divpermission = true;
                        modpermission = true;
                        mulpermission = true;
                        minpermission = true;
                        plusepermission = true;
                        anspermission = true;
                        operation();
                        activitycommander.setViewText(Question, Answer , false);
                    }
                    numpermission=true;
                    changepermissionformsd = false;
                    Changepermissionformin = false;
                }
            }
        });

        btnsum = (Button) view.findViewById(R.id.btnSum);
        btnsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (plusepermission == true) {
                    if (changepermissionformsd == true) {

                        if (Question.charAt(Question.length() - 1) == '-') {
                            if (Question.charAt(Question.length() - 2) == '*' || Question.charAt(Question.length() - 2) == '/') {
                                Question = Question.substring(0, Question.length() - 2) + "+";
                            } else {
                                Question = Question.substring(0, Question.length() - 1) + "+";
                            }
                        } else {
                            Question = Question.substring(0, Question.length() - 1) + "+";
                        }
                    } else {
                        Question = Question + "+";
                    }
                    operation();
                    activitycommander.setViewText(Question, Answer , false);
                    delper = true;
                    changepermissionformsd = true;
                    Changepermissionformin = true;
                    cpermission = true;
                    divpermission = true;
                    modpermission = true;
                    plusepermission = false;
                    minpermission = true;
                    mulpermission = true;
                    anspermission = false;
                    numpermission=true;
                }
            }
        });

        btnsub = (Button) view.findViewById(R.id.btnSub);
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (minpermission == true) {
                    if (Changepermissionformin == true) {
                        Question = Question.substring(0, Question.length() - 1) + "-";
                        changepermissionformsd = true;
                        Changepermissionformin = false;
                        delper = true;
                        cpermission = true;
                        plusepermission = true;
                        minpermission = false;
                        divpermission = true;
                        modpermission = true;
                        mulpermission = true;
                        anspermission = false;
                        numpermission=true;
                        operation();
                        activitycommander.setViewText(Question, Answer , false);
                    } else {
                        Question = Question + "-";
                        operation();
                        activitycommander.setViewText(Question, Answer , false);
                        delper=true;
                        if (Question.length() == 1 && Question.charAt(0) == '-') {
                            plusepermission = false;
                            modpermission = false;
                            divpermission = false;
                            minpermission = false;
                            mulpermission = false;
                            cpermission = true;
                            anspermission = false;
                            delper = true;
                            numpermission=true;
                            changepermissionformsd = false;
                            Changepermissionformin = false;
                        } else {
                            plusepermission = true;
                            modpermission = true;
                            divpermission = true;
                            minpermission = false;
                            mulpermission = true;
                            cpermission = true;
                            anspermission = false;
                            delper = true;
                            numpermission=true;
                            changepermissionformsd = true;
                            Changepermissionformin = false;
                        }
                    }
                }
            }
        });

        btnmul = (Button) view.findViewById(R.id.btnMul);
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mulpermission == true) {
                    if (changepermissionformsd == true) {

                        if (Question.charAt(Question.length() - 1) == '-') {
                            if (Question.charAt(Question.length() - 2) == '*' || Question.charAt(Question.length() - 2) == '/' || Question.charAt(Question.length() - 2) == '%') {
                                Question = Question.substring(0, Question.length() - 2) + "*";
                            } else {
                                Question = Question.substring(0, Question.length() - 1) + "*";
                            }
                        } else {
                            Question = Question.substring(0, Question.length() - 1) + "*";
                        }
                    } else {
                        Question = Question + "*";
                    }
                    operation();
                    activitycommander.setViewText(Question, Answer , false);
                    Changepermissionformin = false;
                    changepermissionformsd = true;
                    delper = true;
                    cpermission = true;
                    numpermission=true;
                    plusepermission = true;
                    minpermission = true;
                    divpermission = true;
                    mulpermission = false;
                    modpermission = true;
                    anspermission = false;
                }
            }
        });

        btndiv = (Button) view.findViewById(R.id.btnDiv);
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (divpermission == true) {
                    if (changepermissionformsd == true) {

                        if (Question.charAt(Question.length() - 1) == '-') {
                            if (Question.charAt(Question.length() - 2) == '*' || Question.charAt(Question.length() - 2) == '/' || Question.charAt(Question.length() - 2) == '%') {
                                Question = Question.substring(0, Question.length() - 2) + "/";
                            } else {
                                Question = Question.substring(0, Question.length() - 1) + "/";
                            }
                        } else {
                            Question = Question.substring(0, Question.length() - 1) + "/";
                        }
                    } else {
                        Question = Question + "/";
                    }
                    operation();
                    activitycommander.setViewText(Question, Answer , false);
                    changepermissionformsd = true;
                    Changepermissionformin = false;
                    delper = true;
                    numpermission=true;
                    cpermission = true;
                    plusepermission = true;
                    minpermission = true;
                    divpermission = false;
                    mulpermission = true;
                    modpermission = true;
                    anspermission = false;
                }
            }
        });

        btnmod = (Button) view.findViewById(R.id.btnMod);
        btnmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (modpermission == true) {
                    if (changepermissionformsd == true) {

                        if (Question.charAt(Question.length() - 1) == '-') {
                            if (Question.charAt(Question.length() - 2) == '*' || Question.charAt(Question.length() - 2) == '/' || Question.charAt(Question.length() - 2) == '%') {
                                Question = Question.substring(0, Question.length() - 2) + "%";
                            } else {
                                Question = Question.substring(0, Question.length() - 1) + "%";
                            }
                        } else {
                            Question = Question.substring(0, Question.length() - 1) + "%";
                        }
                    } else {
                        Question = Question + "%";
                    }
                    operation();
                    activitycommander.setViewText(Question, Answer , false);
                    changepermissionformsd = true;
                    Changepermissionformin = false;
                    delper = true;
                    cpermission = true;
                    numpermission=true;
                    plusepermission = true;
                    minpermission = true;
                    divpermission = true;
                    modpermission = false;
                    mulpermission = true;
                    anspermission = false;
                }
            }
        });

        return view;
    }

    public void operation() {

        Answer = new String("");

        String number1 = new String("0");
        String number2 = new String("0");

        boolean flag1 = false;
        boolean flag2 = false;

        String operation = new String("");

        for (int i = 0; ; i++) {

            if (i < Question.length()) {
                if (Question.charAt(i) == '/' || Question.charAt(i) == '*' || Question.charAt(i) == '%') {
                    if (flag2 == false) {
                        operation = Question.substring(i,i+1);
                        char c = '0';
                        try {
                            c = Question.charAt(i + 1);
                        } catch (StringIndexOutOfBoundsException e) {

                        }
                        if (c == '-') {
                            i++;
                            number2 = "-0";
                        }
                        flag1 = true;
                        flag2 = true;
                    } else {
                        number1 = this.proccess(operation.trim().toString(), number1, number2);
                        flag2 = false;
                        i--;
                        number2 = new String("0");
                    }
                } else if (Question.charAt(i) == '-' || Question.charAt(i) == '+') {
                    if (flag2 == false) {
                        operation = Question.substring(i,i+1);
                        flag1 = true;
                        flag2 = true;
                    } else {
                        number1 = this.proccess(operation.trim().toString(), number1, number2);
                        flag2 = false;
                        i--;
                        number2 = new String("0");
                    }
                } else if ((Question.charAt(i) >= '0' && Question.charAt(i) <= '9') || Question.charAt(i) == '.') {
                    if (flag1 == false) {
                        number1 = number1 + Question.substring(i, i + 1);
                    } else {
                        number2 = number2 + Question.substring(i, i + 1);
                    }
                }
            } else {
                number1 = proccess(operation.trim().toString(), number1, number2);
                break;
            }
        }
        Answer = number1;
        chechans();
    }

    public String proccess(String op, String num1, String num2) {

        Double number1 = Double.parseDouble(num1);
        Double number2 = Double.parseDouble(num2);

        switch (op) {

            case "+" :
                return Double.toString(number1 + number2);

            case "-" :
                return Double.toString(number1 - number2);

            case "*" :
                if (number2 == 0) {
                    number2 = 1.0;
                }
                return Double.toString(number1 * number2);

            case "/" :
                if (number2 == 0) {
                    number2 = 1.0;
                }
                return Double.toString(number1 / number2);

            case "%" :
                if (number2 == 0) {
                    number2 = 1.0;
                }
                return Double.toString(number1 % number2);

            default:
                return Double.toString(number1);

        }
    }


    public boolean cheackdel() {
        for (int i = 0; i < Question.length(); i++) {
            if (Question.charAt(i) == '.') {
                return true;
            } else continue;
        }
        return false;
    }
    public boolean cheackdel1(){

        boolean ret= false;
        for(int i=Question.length()-1;i>=0;i--){
            if((Question.charAt(i)=='/' || Question.charAt(i)=='*' || Question.charAt(i)=='-' || Question.charAt(i)=='+'|| Question.charAt(i)=='%')){
                break;
            }else {
                if (Question.charAt(i) == '.') {
                    ret = true;
                    break;
                }
            }
        }
        return ret;
    }

    public void chechans(){
        for(int i=0;i<Answer.length();i++){
            if(Answer.charAt(i)=='.'){
                int j;
                for(j=i+1;j<Answer.length();j++){
                    if(Answer.charAt(j)!='0'){
                        break;
                    }else{
                        continue;
                    }
                }
                if(j==Answer.length()){
                    Answer = Answer.substring(0,i).trim().toString();
                }
                break;
            }else continue;
        }
    }
}
