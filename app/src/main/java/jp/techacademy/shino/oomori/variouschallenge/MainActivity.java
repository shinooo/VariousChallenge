package jp.techacademy.shino.oomori.variouschallenge;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtText1,txtText2;

    private View.OnClickListener mOnTestClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            //コンテキストからインフレータを取得
            LayoutInflater inflater = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //レイアウトXMLからビュー(レイアウト)をインフレート
            final View popupView = inflater.inflate(R.layout.popup, null);

            // テキスト入力用Viewの作成
            final EditText editView1 = new EditText(MainActivity.this);
            final EditText editView2 = new EditText(MainActivity.this);
            AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
            dialog.setTitle("何か入力してください")
                    .setCancelable(true)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //OKボタンが押下された時に入力された年月をビューに設定する
                       //     txtText1.setText(editView1.getText().toString());
                       //     txtText2.setText(editView2.getText().toString());
                       //     txtText1.setTextColor(Color.RED);
                        }
                    })
                    .setView(popupView)
                    .show(); //ダイアログ表示

/*            // キャンセルボタンの設定
            dialog.setNegativeButton("キャンセル", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                    // キャンセルボタンをタップした時の処理をここに記述
                }
            });
            dialog.show();*/
        }

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        txtText1 = (TextView) findViewById(R.id.text1);
        txtText2 = (TextView) findViewById(R.id.text2);
        findViewById(R.id.test1).setOnClickListener(mOnTestClickListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
