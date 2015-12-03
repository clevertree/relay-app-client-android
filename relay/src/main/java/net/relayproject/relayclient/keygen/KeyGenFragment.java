package net.relayproject.relayclient.keygen;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import net.relayproject.relayclient.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class KeyGenFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View layoutView = inflater.inflate(R.layout.fragment_keygen, container, false);
        TextView txt = (TextView) layoutView.findViewById(R.id.fragment_keygen_text);
        Typeface font = Typeface.createFromAsset(layoutView.getContext().getAssets(), "fonts/Oswald-Bold.ttf");
        txt.setTypeface(font);
        return layoutView;
//        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
//        textView.setText();
//        getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER))
    }
}
