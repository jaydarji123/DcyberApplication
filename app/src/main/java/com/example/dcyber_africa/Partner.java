package com.example.dcyber_africa;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Partner extends AppCompatActivity {

    ListView listViewp;
    String aTitle[] = {"ARCON PIM SOLUTION","KASPERSKY ANTIVIRUS","DECEPTION TECHNOLOGY","ZSCALER CLOUD SECURITY","COPAL","DRUVA CLOUD BACKUP","OCEANBLUE- WAN ENCRYPTION","TAC SECURITY","AMAZON WEB SERVICE","SILVER PEAK","CYLANCE","CLOUDBERRY MSP360","QUANTDART - CRYPTOCURRENCY INVESTMENT PLATFORM"};
    String bDesc[] = {"               ARCON PIM/PAM, an elegant Privileged Access Management / Privileged Identity Management solution, helps management, tracking and control of privileged accounts thereby ensuring fulfillment of regulatory compliances.","               Protecting you starts with protecting your PC. That's why our essential PC protection defends against viruses, ransomware, phishing, spyware, dangerous websites and more.","               Deception technology is a revolutionary new way to detect the stealthiest cyber-attacks. It arms you with an arsenal of digital tripwires to turn the tables on even the most advanced hackers.","               Zscaler is revolutionizing cloud security by helping enterprises move securely into the new world ofcloud and mobility. By providing fast, secure connections.","               COPAL provides a unique, simple and secured online collaboration platform, which allows you to carry out day-to-day work and interact with your colleagues from AnyWhere at AnyTime on AnyDevice.","               UNLOCKING THE TRUE VALUE OF CLOUD BACKUP , Secure, High Performance Backup Designed to Address Today’s Data Governance Challenges.","               With the enterprise broadband access and Internet backbone network capacity increasing, SD-WAN provides a low-cost network solution based on existing circuits.","               TAC Security combines the widest view of vulnerability and risk data across the enterprise to create insightful cyber risk scores.","               The AWS Cloud provides a broad set of infrastructure services, such as computing power, storage options, networking and databases that are delivered as a utility: on–demand, available in seconds, with pay–as–you–go pricing. New services can be provisioned quickly, without upfront capital expensev","               Silver Peak enables businesses of all sizes to realize a multiplier effect from ongoing cloud investments by delivering on a no-compromise WAN transformation strategy.","               Ransomware, advanced threats, fileless malware and malicious documents are no match for the power of artificial intelligence. Replace your antivirus with the smartest endpoint security on the planet.","               MSP360, formerly CloudBerry Lab, is a software and application service provider company that develops online backup, remote desktop and file management products integrated with more than 20 cloud storage providers.","               Using post-quantum digital assetgraphy, our custodial service is super hardened and gives our client much needed peace of mind. Furthermore assets under our custody are backed by insurance as well as fully regulated under the watchful eye of AIFC."};
    int image[] = {R.drawable.arcon1,R.drawable.kaspesky,R.drawable.ss,R.drawable.zscaler1,R.drawable.copal1,R.drawable.dhruva1,R.drawable.oceanblue1,R.drawable.tac,R.drawable.aws,R.drawable.spl,R.drawable.cylan,R.drawable.msp,R.drawable.qd};
    String clink[]={"https://arconnet.com/","https://www.kaspersky.co.in/","https://www.smokescreen.io/","https://www.zscaler.com/","http://www.copal.co/","https://www.druva.com/solutions/cloud-backup/","https://www.oceanbluecloud.com/","https://tacsecurity.com/","https://aws.amazon.com/","https://www.silver-peak.com/","https://www.blackberry.com/us/en/","https://www.msp360.com/","https://www.quantdart.com/"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partner);
        getSupportActionBar().setTitle("Partners");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listViewp = findViewById(R.id.listviewp);
        MAdapter adapter = new MAdapter(this, aTitle,bDesc, image,clink);
        listViewp.setAdapter(adapter);


        listViewp.setOnItemClickListener((parent, view, position, id) ->  {
                if (position == 0) {
                    Intent intent = new Intent(getApplicationContext(), partin.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",image[0]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",aTitle[0]);
                    intent.putExtra("description",bDesc[0]);
                    intent.putExtra("link",clink[0]);
                    intent.putExtra("position",""+0);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(getApplicationContext(),partin.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",image[1]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",aTitle[1]);
                    intent.putExtra("description",bDesc[1]);
                    intent.putExtra("link",clink[1]);
                    intent.putExtra("position",""+1);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(getApplicationContext(),partin.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",image[2]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",aTitle[2]);
                    intent.putExtra("description",bDesc[2]);
                    intent.putExtra("link",clink[2]);
                    intent.putExtra("position",""+2);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(getApplicationContext(),partin.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",image[3]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",aTitle[3]);
                    intent.putExtra("description",bDesc[3]);
                    intent.putExtra("link",clink[3]);
                    intent.putExtra("position",""+3);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(getApplicationContext(),partin.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",image[4]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",aTitle[4]);
                    intent.putExtra("description",bDesc[4]);
                    intent.putExtra("link",clink[4]);
                    intent.putExtra("position",""+4);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(getApplicationContext(),partin.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",image[5]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",aTitle[5]);
                    intent.putExtra("description",bDesc[5]);
                    intent.putExtra("link",clink[5]);
                    intent.putExtra("position",""+5);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(getApplicationContext(),partin.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",image[6]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",aTitle[6]);
                    intent.putExtra("description",bDesc[6]);
                    intent.putExtra("link",clink[6]);
                    intent.putExtra("position",""+6);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(getApplicationContext(),partin.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",image[7]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",aTitle[7]);
                    intent.putExtra("description",bDesc[7]);
                    intent.putExtra("link",clink[7]);
                    intent.putExtra("position",""+7);
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(getApplicationContext(),partin.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",image[8]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",aTitle[8]);
                    intent.putExtra("description",bDesc[8]);
                    intent.putExtra("link",clink[8]);
                    intent.putExtra("position",""+8);
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(getApplicationContext(),partin.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",image[9]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",aTitle[9]);
                    intent.putExtra("description",bDesc[9]);
                    intent.putExtra("link",clink[9]);
                    intent.putExtra("position",""+9);
                    startActivity(intent);
                }
                if (position == 10) {
                    Intent intent = new Intent(getApplicationContext(),partin.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",image[10]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",aTitle[10]);
                    intent.putExtra("description",bDesc[10]);
                    intent.putExtra("link",clink[10]);
                    intent.putExtra("position",""+10);
                    startActivity(intent);
                }
                if (position == 11) {
                    Intent intent = new Intent(getApplicationContext(),partin.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",image[11]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",aTitle[11]);
                    intent.putExtra("description",bDesc[11]);
                    intent.putExtra("link",clink[11]);
                    intent.putExtra("position",""+11);
                    startActivity(intent);
                }
                if (position == 12) {
                    Intent intent = new Intent(getApplicationContext(),partin.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",image[12]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",aTitle[12]);
                    intent.putExtra("description",bDesc[12]);
                    intent.putExtra("link",clink[12]);
                    intent.putExtra("position",""+12);
                    startActivity(intent);
                }
                if (position == 13) {
                    Intent intent = new Intent(getApplicationContext(),partin.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",image[13]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",aTitle[13]);
                    intent.putExtra("description",bDesc[13]);
                    intent.putExtra("link",clink[13]);
                    intent.putExtra("position",""+13);
                    startActivity(intent);
                }
            });
        }

    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
        class MAdapter extends ArrayAdapter<String> {
            Context context;
            String bTitle[];
            String CDesc[];
            String[] Blink;
            int bImgs[];

            MAdapter(Context c, String[] title, String[] desc, int[] imgs, String[] clink) {
                super(c, R.layout.ro,R.id.textj1,title);
                this.context=c;
                this.bTitle=title;
                this.CDesc=desc;
                this.bImgs=imgs;
                this.Blink=clink;
            }

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View ro = layoutInflater.inflate(R.layout.ro,parent,false);
                ImageView images = ro.findViewById(R.id.image);
                TextView myTitle = ro.findViewById(R.id.textj1);

                images.setImageResource(bImgs[position]);
                myTitle.setText(bTitle[position]);
                return ro;
            }
        }

}