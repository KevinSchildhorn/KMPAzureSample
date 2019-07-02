//
//  ViewController.swift
//  iosApp
//
//  Created by Kevin Schildhorn on 7/2/19.
//  Copyright © 2019 Kevin Schildhorn. All rights reserved.
//

import UIKit
import shared

class ViewController: UIViewController {

    @IBOutlet weak var label: UILabel!
    override func viewDidLoad() {
        super.viewDidLoad()
        label.text = Platform().name
    }


}

