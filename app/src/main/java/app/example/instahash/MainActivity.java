package app.example.instahash;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView privacyPolicy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CardView one = findViewById(R.id.one);
        CardView two = findViewById(R.id.two);
        CardView three = findViewById(R.id.three);
        CardView four = findViewById(R.id.four);
        CardView five = findViewById(R.id.five);
        CardView six = findViewById(R.id.six);
        CardView seven = findViewById(R.id.seven);
        CardView eight = findViewById(R.id.eight);
        CardView nine = findViewById(R.id.nine);

        CardView a10 = findViewById(R.id.a10);
        CardView a11 = findViewById(R.id.a11);
        CardView a12 = findViewById(R.id.a12);
        CardView a13 = findViewById(R.id.a13);
        CardView a14 = findViewById(R.id.a14);
        CardView a15 = findViewById(R.id.a15);
        CardView a16 = findViewById(R.id.a16);
        CardView a17 = findViewById(R.id.a17);
        CardView a18 = findViewById(R.id.a18);
        CardView a19 = findViewById(R.id.a19);
        CardView a20 = findViewById(R.id.a20);
        CardView a21 = findViewById(R.id.a21);




        privacyPolicy.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView = findViewById(R.id.viewall);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, PopularHashes.class);
                startActivity(i);
            }
        });


        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);

        a10.setOnClickListener(this);
        a11.setOnClickListener(this);
        a12.setOnClickListener(this);
        a13.setOnClickListener(this);
        a14.setOnClickListener(this);
        a15.setOnClickListener(this);
        a16.setOnClickListener(this);
        a17.setOnClickListener(this);
        a18.setOnClickListener(this);
        a19.setOnClickListener(this);
        a20.setOnClickListener(this);
        a21.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.one:
                Intent one = new Intent(MainActivity.this, HashActivity.class);
                one.putExtra("Head", "Love");
                one.putExtra("Tag", "#love #loveit #lovely #naturelovers #loveher #loveyourself #loveyou #doglover #lovehim #catlover #lovethem #lovelife #lovemyjob #loveislove #lovequotes #makeuplover #lovedogs #loveofmylife #coffeelover #lovers #lovecats #lovemylife #lover #lovestory #lovefood #loveu #lovepuppies #loves #lovemydog #loved");
                startActivity(one);

                break;


            case R.id.two:
                Intent two = new Intent(MainActivity.this, HashActivity.class);
                two.putExtra("Head", "Music");
                two.putExtra("Tag", "#music #musica #musician #musically #musicvideo #musical #musicians #musicislife #musicproducer #musiclife #musiclover #musicfestival #musicphotography #musicproduction #musicallyapp #musicismylife #musiclovers #technomusic #musicaltheatre #musicianlife #musicals #musicstudio #musicindustry #musiccity #musicartist #musicvideos #metalmusic #musicallyindia #musiclove #musicaboa");
                startActivity(two);

                break;

            case R.id.three:
                Intent three = new Intent(MainActivity.this, HashActivity.class);
                three.putExtra("Head", "Friends");
                three.putExtra("Tag", "#friends #bestfriends #friendship #friendshipgoals #friendsforever #friendsforlife #friendships #friendstime #friendshipquotes #friendsinperson #friendsgiving #friendsnotfood #friendsandfamily #linefriends #friendslikefamily #friends4ever #internetfriends #jwfriends #fakefriends #friends4life #friendstvshow #friendsday #friendsinbnw #friends\uD83D\uDC6D #friendsinstreets #friendshipismagic #friendsforkeeps #friendstrip #friendshipgoals\uD83D\uDC95 #friendshipneverends");
                startActivity(three);

                break;

            case R.id.four:
                Intent four = new Intent(MainActivity.this, HashActivity.class);
                four.putExtra("Head", "Travel");
                four.putExtra("Tag", "#travel #travelgram #instatravel #travelphotography #traveling #travelling #travelblogger #traveler #traveller #travelingram #traveltheworld #travelblog #travels #traveladdict #travelphoto #traveldiaries #travelpics #travelawesome #travelbug #travelholic #travelstoke #traveldeeper #travelers #travelpic #traveldiary #travelmore #travellers #travellingthroughtheworld #travelph #travelguide");
                startActivity(four);

                break;

            case R.id.five:
                Intent five = new Intent(MainActivity.this, HashActivity.class);
                five.putExtra("Head", "Photography");
                five.putExtra("Tag", "#photography #travelphotography #naturephotography #streetphotography #foodphotography #portraitphotography #landscapephotography #weddingphotography #blackandwhitephotography #filmphotography #fashionphotography #canonphotography #mobilephotography #architecturephotography #photographylovers #wildlifephotography #nightphotography #macrophotography #photographyislife #photographysouls #photographyeveryday #photographylover #bnwphotography #photographyislifee #toyphotography #dogphotography #indianphotography #dronephotography #bookphotography #carphotography");
                startActivity(five);

                break;

            case R.id.six:
                Intent six = new Intent(MainActivity.this, HashActivity.class);
                six.putExtra("Head", "Movies");
                six.putExtra("Tag", "#movies #movietime\uD83C\uDFAC\n #movie #film #cinema #films #hollywood #actor #love #s #cinematography #actress #art #netflix #music #bollywood #moviescenes #filmmaking #instagood #horror #comedy #photography #instagram #cine #cinephile #tv #filmmaker #movienight #director #drama");
                startActivity(six);

                break;


            case R.id.seven:
                Intent seven = new Intent(MainActivity.this, HashActivity.class);
                seven.putExtra("Head", "Game");
                seven.putExtra("Tag", "#gaming #gamingmemes #gaminglife #gamingsetup #gamingpc #gamingcommunity #gamingmeme #videogaming #gamingposts #gamingislife #gamingphotography #gamingroom #gamingrig #gamingclips #gamingchannel #gamingnews #gamingsetups #gaminggear #gamingchair #pcgaming101 #gamingfolk #gaming\uD83C\uDFAE #gaming4life #gaminggirl #gamingart #gamingscreenshot #gamingaddict #gamingmouse #gamingkeyboard #gamingforlife");
                startActivity(seven);

                break;


            case R.id.eight:
                Intent eight = new Intent(MainActivity.this, HashActivity.class);
                eight.putExtra("Head", "Health");
                eight.putExtra("Tag", "#bodybuilding #Cancer #conscioushealthsolutions #diet #exercise #fatburning #FatLoss #fit #fitness #food #gym #health #Healthcare #healthy #healthyeating #healthyliving #lifestyle #medicine #motivation #news #nutrition #organic #protein #recipes #Solution #vegan #vitamin #weightloss #wellness #workout #yoga");
                startActivity(eight);

                break;

            case R.id.nine:
                Intent nine = new Intent(MainActivity.this, HashActivity.class);
                nine.putExtra("Head", "Art");
                nine.putExtra("Tag", "#art #artist #artwork #makeupartist #nailart #instaart #arte #streetart #digitalart #artofvisuals #artistsoninstagram #artoftheday #artsy #artistic #arts #artgallery #modernart #artists #animeart #artistsofinstagram #nailsart #artlovers #artesanato #foodart #artlife #artistoninstagram #art\uD83C\uDFA8 #artstagram #makeupartistsworldwide #artista");
                startActivity(nine);

                break;

            case R.id.a10:
                Intent a10 = new Intent(MainActivity.this, HashActivity.class);
                a10.putExtra("Head", "Beauty");
                a10.putExtra("Tag", "#beauty #makeup #love #beautiful #fashion #skincare #photography #instagood #style #model #like #photooftheday #follow #instagram #nature #art #hair #makeupartist #cute #girl #picoftheday #photo #mua #lashes #happy #cosmetics #smile #life #nails");
                startActivity(a10);

                break;

            case R.id.a11:
                Intent a11 = new Intent(MainActivity.this, HashActivity.class);
                a11.putExtra("Head", "Business");
                a11.putExtra("Tag", "#business #entrepreneur #marketing #success #motivation #money #love #entrepreneurship #startup #smallbusiness #businessowner #inspiration #instagood #mindset #lifestyle #instagram #digitalmarketing #work #life #goals #design #branding #follow #realestate #investment #businesswoman #finance #fashion #socialmedia");
                startActivity(a11);

                break;

            case R.id.a12:
                Intent a12 = new Intent(MainActivity.this, HashActivity.class);
                a12.putExtra("Head", "Couples");
                a12.putExtra("Tag", "#couples #love #couplegoals #couple #relationshipgoals #cute #like #couplesgoals #lovequotes #photography #instagram #instagood #follow #relationships #wedding #boyfriend #kiss #girlfriend #relationship #loveyou #happy #together #lovers #romance #family #beautiful #forever #goals #couplelove");
                startActivity(a12);

                break;

            case R.id.a13:
                Intent a13 = new Intent(MainActivity.this, HashActivity.class);
                a13.putExtra("Head", "Drinks");
                a13.putExtra("Tag", "#drinks #cocktails #bar #food #drink #party #bartender #cocktail #beer #music #mixology #instagood #love #foodie #nightlife #friends #happyhour #wine #fun #drinkstagram #foodporn #alcohol #gin #cheers #restaurant #drinkup #dance #vodka #dj");
                startActivity(a13);

                break;

            case R.id.a14:
                Intent a14 = new Intent(MainActivity.this, HashActivity.class);
                a14.putExtra("Head", "Family");
                a14.putExtra("Tag", "#family #love #friends #happy #instagood #life #baby #fun #photography #like #kids #familytime #photooftheday #instagram #follow #cute #smile #beautiful #nature #picoftheday #travel #home #fashion #art #happiness #food #familia #music #lifestyle");
                startActivity(a14);

                break;

            case R.id.a15:
                Intent a15 = new Intent(MainActivity.this, HashActivity.class);
                a15.putExtra("Head", "Fitness");
                a15.putExtra("Tag", "#fitness #gym #workout #fit #fitnessmotivation #motivation #bodybuilding #training #health #fitfam #lifestyle #love #sport #healthy #healthylifestyle #crossfit #gymlife #instagood #personaltrainer #exercise #muscle #fitnessmodel #weightloss #gymmotivation #yoga #fitnessgirl #follow #fitspo #instafit");
                startActivity(a15);

                break;

            case R.id.a16:
                Intent a16 = new Intent(MainActivity.this, HashActivity.class);
                a16.putExtra("Head", "Holiday");
                a16.putExtra("Tag", "#holidays #travel #summer #holiday #love #vacation #nature #beach #christmas #photography #instagood #travelphotography #sea #travelgram #family #photooftheday #picoftheday #trip #sun #happy #winter #instatravel #greece #vacances #instagram #beautiful #fun #travelling #happyholidays");
                startActivity(a16);

                break;

            case R.id.a17:
                Intent a17 = new Intent(MainActivity.this, HashActivity.class);
                a17.putExtra("Head", "Pet");
                a17.putExtra("Tag", "#pet #dog #pets #dogs #cute #dogsofinstagram #cat #petsofinstagram #cats #love #petstagram #animal #animals #puppy #instadog #instagram #dogstagram #doglover #of #catsofinstagram #dogoftheday #doglovers #instapet #instacat #catstagram #catlover #ilovemydog #instagood #petshop");
                startActivity(a17);

                break;

            case R.id.a18:
                Intent a18 = new Intent(MainActivity.this, HashActivity.class);
                a18.putExtra("Head", "Technology");
                a18.putExtra("Tag", "#technology #tech #innovation #engineering #business #iphone #science #design #apple #electronics #technews #gadgets #smartphone #android #instagood #pro #software #programming #computer #samsung #instatech #bhfyp #gadget #security #mobile #coding #education #techie #future");
                startActivity(a18);

                break;
            case R.id.a19:
                Intent a19 = new Intent(MainActivity.this, HashActivity.class);
                a19.putExtra("Head", "Memes");
                a19.putExtra("Tag", "#memes #dankmemes #funnymemes #memesdaily #edgymemes  #offensivememes  #dailymemes  #memestagram  #spicymemes  #btsmemes  #animememes #dankmemesdaily  #bestmemes  #spongebobmemes #darkmemes  #memestar  #relatablememes  #stolenmemes #instamemes #memesrlife #hindimemes #indianmemes #indianmemesdaily");
                startActivity(a19);

                break;
            case R.id.a20:
                Intent a20 = new Intent(MainActivity.this, HashActivity.class);
                a20.putExtra("Head", "Shayari");
                a20.putExtra("Tag", "#shayari  #love  #poetry   #quotes #sad   #writer  #followforfollowback   #writersofinstagram  #thoughts  #lovequotes  #shayar  #instadaily   #loveyourself  #urdupoetry #instagram   #likes   #hindishayari  #writing  #photooftheday #shayarilover #follow  #poetrycommunity #yourself #words #hindi #likeforlikes #urdu #life #shayariquotes #like #hindiquotes #shayri #urdushayari #poem #ishq #viral #mohabbat #sadshayari #beautiful #photography #poet #goals #smile #story #motivational #dil #writerscommunity #poetsofinstagram #positivity #storywa #mindset #poems #loveshayari #instagood #art #writers");
                startActivity(a20);

                break;

            case R.id.a21:
                Intent a21 = new Intent(MainActivity.this, HashActivity.class);
                a21.putExtra("Head", "Motivation");
                a21.putExtra("Tag", "#motivation #inspiration #fitness #life #quotes #instagood #lifestyle #success #motivationalquotes #instagram #workout #goals #gym #believe #positivevibes #mindset #happy #happiness #selflove #follow #bhfyp #fitnessmotivation #like #fit #training#bodybuilding #positivity #quoteoftheday #yourself #business #photooftheday #photography #motivational #quote #fitfam #healthy #smile #instadaily #inspire #healthylifestyle #sport #selfcare #beautiful #gymlife #nature #fashion #weightloss #picoftheday #lifequotes #muscle #exercise #successquotes #nevergiveup #strong #entrepreneur #loveyourself #inspirationalquotes");
                startActivity(a21);

                break;




        }

    }

    @Override
    public void onBackPressed()
    {
        finishAffinity();
    }
}