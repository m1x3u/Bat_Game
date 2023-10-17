package com.example.bat_game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.m_bat_game_.EndActivity
import com.example.m_bat_game_.R

class MainActivity : AppCompatActivity() {
    var questionNo = 0
    var questions = listOf("Как давно на Земле появились летучие мыши? \n\n A) •65 млн.лет назад \n\n B) •52 млн.лет назад \n\n C) •15 млн.лет назад", "2.Сколько детёнышей в год обычно рождается у летучих мышей? \n\n A) 10 \n\n B) 5 \n\n C) 1", "3.Сколько насекомых за ночь может съесть летучая мышь? \n\n A) •Несколько сотен бабочек или жуков \n\n B) •Несколько десятков бабочек или жуков \n\n C) •До десяти бабочек или жуков", "4.На каких континентах обитают летучие мыши? \n\n A) На всех \n\n B) •На всех, кроме Антарктиды \n\n C) •На всех, кроме Антарктиды и Австралии", "5.Когда проводится Международная ночь летучих мышей? \n\n A) •Последнее воскресение августа \n\n B) •С 20 на 21 сентября \n\n C) •1 апреля", "6.Чему равна масса самой маленькой летучей мыши? \n\n A) •2 г. \n\n B) •10 г. \n\n C) •50 г.", "7.Чему равна масса самой большой летучей мыши? \n\n A) •800 г \n\n B) •1,5 кг \n\n C) •3 кг", "8. Сколько видов летучих мышей существует на Земле? \n\n A) •Около  250 \n\n B) •Около 500 \n\n C) •Около 1250 ", "9.Почему у летучих мышей не бывает ожирения?  \n\n A) •У летучих мышей очень быстрый обмен веществ \n\n B) •Летучие мыши много двигаются \n\n C) •Летучие мыши мало едят", "10.Как называется раздел зоологии, который изучает летучих мышей?  \n\n A) •Орнитология \n\n B) •Хироптерология \n\n C) •Герпетология", "")
    var correct_answers = 0
    var rightAnswers = listOf(2, 1, 1, 2, 2, 1, 2, 3, 1, 2, 0)
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)

        button.setOnClickListener {
            showToast(1)
        }

        button2.setOnClickListener {
            showToast(2)
        }

        button3.setOnClickListener {
            showToast(3)
        }

    }

    fun showToast(answer: Int) {
        counter +=1
        if (answer==rightAnswers.get(questionNo)) {
            Toast.makeText(applicationContext, "Правильно", Toast.LENGTH_SHORT).show()

            updateQuestion()
        } else {
            Toast.makeText(applicationContext, "Неправильно", Toast.LENGTH_SHORT).show()
        }
    }

    fun updateQuestion() {
        correct_answers += 1
        questionNo = questionNo + 1
        val textView = findViewById<TextView>(R.id.textView)
        textView.setText(questions.get(questionNo))
        //if (questions ==){
        //   Toast.makeText(applicationContext, "Ты ответил правильно на $correct_answers вопросов.", Toast.LENGTH_SHORT).show()
        //  val intent = Intent(this, EndActivity::class.java)
        //  startActivity(intent)
        }

    }

